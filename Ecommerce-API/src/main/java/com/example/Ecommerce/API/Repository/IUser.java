package com.example.Ecommerce.API.Repository;

import com.example.Ecommerce.API.Model.Address;
import com.example.Ecommerce.API.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUser extends JpaRepository<User,Integer> {
}
