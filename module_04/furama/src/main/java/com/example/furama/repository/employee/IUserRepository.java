package com.example.furama.repository.employee;

import com.example.furama.model.employee.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository <User, Integer> {
}
