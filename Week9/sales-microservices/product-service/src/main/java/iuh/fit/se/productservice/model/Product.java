package iuh.fit.se.productservice.model;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private double price;

    @Column(name = "quantity_in_stock") // 👈 map đúng tên cột trong DB
    private int quantityInStock;
}
