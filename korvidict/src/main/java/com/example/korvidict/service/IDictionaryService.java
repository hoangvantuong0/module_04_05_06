package com.example.korvidict.service;

import com.example.korvidict.model.Dictionary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IDictionaryService extends IGeneralService<Dictionary>{
    Page<Dictionary> findAll(Pageable pageable);

    Page<Dictionary> searchByWord(String name, Pageable pageable);

    Optional<Dictionary> findById(Integer id);

    void remove(Integer id);

    Iterable<Dictionary> findAll();

    void save(Dictionary dictionary);
}
