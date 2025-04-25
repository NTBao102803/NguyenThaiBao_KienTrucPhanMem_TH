package iuh.fit.se.productservice.controller;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import io.github.resilience4j.timelimiter.annotation.TimeLimiter;
import iuh.fit.se.productservice.model.Product;
import iuh.fit.se.productservice.repository.ProductRepository;
import iuh.fit.se.productservice.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductRepository productRepository;
    private final ProductService productService;

    // GET all products with full Resilience4j
    @GetMapping
    @CircuitBreaker(name = "productService", fallbackMethod = "fallbackGetAll")
    @Retry(name = "productService")
    @RateLimiter(name = "productService")
    @TimeLimiter(name = "productService")
    public CompletableFuture<ResponseEntity<List<Product>>> getAllProducts() {
        return CompletableFuture.supplyAsync(() -> ResponseEntity.ok(productRepository.findAll()));
    }

    // Fallback method for getAllProducts
    public CompletableFuture<ResponseEntity<List<Product>>> fallbackGetAll(Throwable t) {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("Fallback triggered: " + t.getMessage());
            return ResponseEntity.ok(List.of());
        });
    }

    // GET by ID with circuit breaker
    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable Long id) {
        Product product = productService.getProductById(id);
        return ResponseEntity.ok(product);
    }

    // POST create product
    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        return ResponseEntity.ok(productRepository.save(product));
    }

    // PUT update product
    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product updatedProduct) {
        return productRepository.findById(id)
                .map(product -> {
                    product.setName(updatedProduct.getName());
                    product.setDescription(updatedProduct.getDescription());
                    product.setPrice(updatedProduct.getPrice());
                    product.setQuantityInStock(updatedProduct.getQuantityInStock());
                    return ResponseEntity.ok(productRepository.save(product));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // DELETE product
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
        productRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}