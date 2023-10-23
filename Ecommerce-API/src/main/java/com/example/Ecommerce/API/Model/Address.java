package com.example.Ecommerce.API.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addId;
    private String addName;
    private String addLandMark;
    private String addZipCode;
    private String addPhoneNumber;
    private String addState;

    @ManyToOne
    @JoinColumn(name = "fk_userId")
    User user;
}