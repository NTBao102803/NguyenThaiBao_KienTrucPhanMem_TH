package iuh.fit.se.productservice.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import iuh.fit.se.productservice.model.Product;
import iuh.fit.se.productservice.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    @CircuitBreaker(name = "productService", fallbackMethod = "fallbackGetProductById")
    public Product getProductById(Long id) {
        if (id == 9999) {
            throw new RuntimeException("Simulated failure");
        }
        return productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }

    // Fallback method
    public Product fallbackGetProductById(Long id, Throwable throwable) {
        System.out.println("Fallback được gọi do lỗi: " + throwable.getMessage());
        Product fallbackProduct = new Product();
        fallbackProduct.setId(id);
        fallbackProduct.setName("Sản phẩm không khả dụng");
        fallbackProduct.setDescription("Đây là bản fallback do lỗi dịch vụ");
        fallbackProduct.setPrice(0.0);
        fallbackProduct.setQuantityInStock(0);
        return fallbackProduct;
    }
}
