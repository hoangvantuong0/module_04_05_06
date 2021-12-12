package com.example.final_exam.service;

import com.example.final_exam.model.ShowTime;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IShowTimeService{
    Page<ShowTime> findAll(Pageable pageable);

    Iterable<ShowTime> findAll();

    Optional<ShowTime> findById(String id);

    void save(ShowTime t);

    void remove(String id);
    Page<ShowTime> searchByName(String name, Pageable pageable);


    boolean existsById(String id);
}
