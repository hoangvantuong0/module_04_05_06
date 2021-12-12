package com.example.final_exam.service;

import com.example.final_exam.model.Film;

import java.util.Optional;

public interface IFilmService {
    //    Page<Film> findAll(Pageable pageable);
//    Page<Film> searchByName(String name, Pageable pageable);
//    Optional<Film> findById(String id);
//    void remove(String id);
    Iterable<Film> findAll();

    Optional<Film> findById(String id);

    void save(Film t);

    void remove(String id);
}
