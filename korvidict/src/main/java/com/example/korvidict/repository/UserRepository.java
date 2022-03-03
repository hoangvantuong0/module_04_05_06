package com.example.korvidict.repository;

import com.example.korvidict.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Integer> {
    User findByUserName(String userName);
}
