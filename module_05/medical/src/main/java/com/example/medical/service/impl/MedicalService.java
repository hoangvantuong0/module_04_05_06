package com.example.medical.service.impl;

import com.example.medical.model.Medical;
import com.example.medical.repository.IMedicalRepository;
import com.example.medical.service.IMedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MedicalService implements IMedicalService {
    @Autowired
    IMedicalRepository medicalRepository;
    @Override
    public Page<Medical> findAll(Pageable pageable) {
        return medicalRepository.findAll(pageable);
    }

    @Override
    public Iterable< Medical > findAll() {
        return medicalRepository.findAll();
    }

    @Override
    public Optional< Medical > findById(Integer id) {
        return medicalRepository.findById(id);
    }

    @Override
    public void save(Medical medical) {
        medicalRepository.save(medical);
    }

    @Override
    public void remove(Integer id) {
        medicalRepository.deleteById(id);
    }
}
