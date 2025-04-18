package iuh.fit.se.orderservice.repository;

import iuh.fit.se.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
