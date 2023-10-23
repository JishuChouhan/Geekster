package com.example.Ecommerce.API.Repository;

import com.example.Ecommerce.API.Model.Address;
import com.example.Ecommerce.API.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrder extends JpaRepository<Order,Integer> {
}
