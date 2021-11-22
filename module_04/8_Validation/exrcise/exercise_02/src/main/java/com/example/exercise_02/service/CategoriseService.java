package com.example.exercise_02.service;

import com.example.exercise_02.model.Categorise;
import com.example.exercise_02.repository.ICategoriseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriseService implements ICategoriseService {
    @Autowired
    private ICategoriseRepository categoriseRepository;

    @Override
    public Iterable<Categorise> findAll() {
        return categoriseRepository.findAll();
    }

    @Override
    public Optional< Categorise > findById(Integer id) {
        return categoriseRepository.findById(id);
    }

    @Override
    public void save(Categorise province) {
        categoriseRepository.save(province);
    }

    @Override
    public void remove(Integer id) {
        categoriseRepository.deleteById(id);
    }
}