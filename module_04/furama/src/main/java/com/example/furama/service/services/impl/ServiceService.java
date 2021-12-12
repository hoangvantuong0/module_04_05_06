package com.example.furama.service.services.impl;


import com.example.furama.model.services.Services;
import com.example.furama.repository.services.IServiceRepository;
import com.example.furama.service.services.IServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.Optional;


//??
@Component
public class ServiceService implements IServiceService {
    @Autowired
    IServiceRepository serviceRepository;

    @Override
    public Iterable<Services> findAll() {
        return serviceRepository.findAll();
    }

    @Override
    public Optional<Services> findById(Integer id) {
        return serviceRepository.findById(id);
    }

    @Override
    public void save(Services services) {
        serviceRepository.save(services);
    }

    @Override
    public void remove(Integer id) {
        serviceRepository.deleteById(id);
    }

    @Override
    public Optional<Services> findById(String id) {
        return serviceRepository.findById(Integer.valueOf(id));
    }

    @Override
    public Page<Services> findAll(Pageable pageable) {
        return serviceRepository.findAll(pageable);
    }

    @Override
    public Page<Services> searchByName(String name, Pageable pageable) {
        return serviceRepository.searchByName(name, pageable);
    }
}
