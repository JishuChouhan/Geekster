package com.example.Ecommerce.API.Service;

import com.example.Ecommerce.API.Model.Order;
import com.example.Ecommerce.API.Model.Product;
import com.example.Ecommerce.API.Repository.IOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
@Service
public class OrderService {
    @Autowired
    IOrder iOrder;

    public String placeOrder(Order newOrder){
        iOrder.save(newOrder);
        return "Order Placed";
    }

    public List<Order> getOrderById(Integer id){
        return iOrder.findAllById(Collections.singleton(id));
    }
}
