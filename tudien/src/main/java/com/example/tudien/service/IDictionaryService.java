package com.example.tudien.service;

import com.example.tudien.model.Dictionary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface IDictionaryService {
    Page<Dictionary> findAll(Pageable pageable);

    Page<Dictionary> searchByWord(String name, Pageable pageable);

    Optional<Dictionary> findById(Integer id);

    void remove(Integer id);

    Iterable<Dictionary> findAll();

    void save(Dictionary dictionary);
}
