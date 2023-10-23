package com.example.Ecommerce.API.Controller;

import com.example.Ecommerce.API.Model.User;
import com.example.Ecommerce.API.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("user")
    public String addUser(@RequestBody User newUser){
        return userService.addUser(newUser);
    }

    @GetMapping("userById")
    public List<User> getUserById(@RequestParam Integer id){
        return userService.getUserById(id);
    }
}
