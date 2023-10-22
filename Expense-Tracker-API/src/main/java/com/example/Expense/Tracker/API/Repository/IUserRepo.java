package com.example.Expense.Tracker.API.Repository;

import com.example.Expense.Tracker.API.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
