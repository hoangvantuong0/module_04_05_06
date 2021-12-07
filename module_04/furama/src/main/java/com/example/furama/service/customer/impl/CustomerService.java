package com.example.furama.service.customer.impl;

import com.example.furama.model.customer.Customer;
import com.example.furama.repository.customer.ICustomerRepository;
import com.example.furama.service.customer.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    ICustomerRepository customerRepository;


    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(Integer id) {

    }

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public Page<Customer> searchByName(String name, Pageable pageable) {
        return customerRepository.searchByName(name, pageable);
    }

    @Override
    public Optional<Customer> findById(String id) {
        return customerRepository.findById(id);
    }

    @Override
    public void remove(String id) {
        customerRepository.deleteById(id);
    }
}
