package com.example.final_exam.service.impl;

import com.example.final_exam.model.ShowTime;
import com.example.final_exam.repository.IShowTimeRepository;
import com.example.final_exam.service.IShowTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ShowTimeService implements IShowTimeService {

    @Autowired
    IShowTimeRepository showTimeRepository;


    @Override
    public Page<ShowTime> findAll(Pageable pageable) {
        return showTimeRepository.findAll(pageable);
    }

    @Override
    public Iterable<ShowTime> findAll() {
        return showTimeRepository.findAll();
    }

    @Override
    public Optional<ShowTime> findById(String id) {
        return showTimeRepository.findById(id);
    }

    @Override
    public void save(ShowTime t) {
        showTimeRepository.save(t);
    }

    @Override
    public void remove(String id) {
        showTimeRepository.deleteById(id);
    }

    @Override
    public Page<ShowTime> searchByName(String name, Pageable pageable) {
        return showTimeRepository.searchByName(name, pageable);
    }

    @Override
    public boolean existsById(String id) {
        return showTimeRepository.existsById(id);
    }

//    @Override
//    public boolean existsByName(String id) {
//        return showTimeRepository.existsById(id);
//    }
}
