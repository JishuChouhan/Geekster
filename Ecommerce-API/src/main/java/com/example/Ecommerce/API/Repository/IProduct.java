package com.example.Ecommerce.API.Repository;

import com.example.Ecommerce.API.Model.Address;
import com.example.Ecommerce.API.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IProduct extends JpaRepository<Product,Integer> {
    List<Product> findByProdCategory(String category);
}
