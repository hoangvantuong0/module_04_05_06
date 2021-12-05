package com.example.furama.service.customer;

import com.example.furama.model.customer.Customer;
import com.example.furama.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ICustomerService extends IGeneralService < Customer> {
    Page<Customer> findAll(Pageable pageable);
    Page<Customer> searchByName(String name, Pageable pageable);
    Optional<Customer> findById(String id);
    void remove(String id);
}