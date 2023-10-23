package com.example.Ecommerce.API.Controller;

import com.example.Ecommerce.API.Model.Order;
import com.example.Ecommerce.API.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("order")
    public String placeOrder(@RequestBody Order newOrder){
        return orderService.placeOrder(newOrder);
    }

    @GetMapping("orderById")
    public List<Order> getOrderById(@RequestParam Integer id){
        return orderService.getOrderById(id);
    }
}
