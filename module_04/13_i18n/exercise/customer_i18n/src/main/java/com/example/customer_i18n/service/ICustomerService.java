package com.example.customer_i18n.service;

import com.example.customer_i18n.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerService  extends IGeneralService< Customer >{
    Page<Customer> findAll(Pageable pageable);
    Page<Customer> findAllByFirstNameContaining(String firstName, Pageable pageable);
}