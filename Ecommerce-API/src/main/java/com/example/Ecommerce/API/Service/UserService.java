package com.example.Ecommerce.API.Service;

import com.example.Ecommerce.API.Model.User;
import com.example.Ecommerce.API.Repository.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserService {
    @Autowired
    IUser iUser;

    public String addUser(User newUser){
        iUser.save(newUser);
        return "User Added";
    }

    public List<User> getUserById(Integer id){
        return iUser.findAllById(Collections.singleton(id));
    }
}
