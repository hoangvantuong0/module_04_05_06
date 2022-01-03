package com.example.medical.service;

import com.example.medical.model.Patient;

import java.util.Optional;

public interface IPatientService {
    Iterable<Patient> findAll();

    Optional< Patient > findById(Integer id);

    void save(Patient patient);

    void remove(Integer id);
}