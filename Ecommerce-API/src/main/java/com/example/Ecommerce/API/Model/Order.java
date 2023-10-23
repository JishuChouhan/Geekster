package com.example.Ecommerce.API.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;
    private Integer orderQuantity;

    @ManyToOne
    @JoinColumn(name = "fk_user")
    User user;

    @ManyToOne
    @JoinColumn(name = "fk_address")
    Address address;

    @ManyToOne
    @JoinColumn(name = "fk_product")
    Product product;
}
