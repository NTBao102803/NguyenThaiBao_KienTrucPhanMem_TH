package iuh.fit.se.customerservice.repository;

import iuh.fit.se.customerservice.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
