package iuh.fit.se.productservice.repository;

import iuh.fit.se.productservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
