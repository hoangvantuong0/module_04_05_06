package com.example.tudien.service;

import com.example.tudien.model.PartsOf;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface IPartsOfService {
    Page<PartsOf> findAll(Pageable pageable);

    Page<PartsOf> searchByWord(String name, Pageable pageable);

    Optional<PartsOf> findById(Integer id);

    void remove(Integer id);

    Iterable<PartsOf> findAll();

    void save(PartsOf partsOf);
}
