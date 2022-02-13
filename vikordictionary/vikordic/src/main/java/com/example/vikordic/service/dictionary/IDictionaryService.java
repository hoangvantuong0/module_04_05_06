package com.example.vikordic.service.dictionary;

import com.example.vikordic.model.Dictionary;
import com.example.vikordic.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IDictionaryService extends IGeneralService<Dictionary> {
//
//    Page<Dictionary> findAll(Pageable pageable);
//    Page<Dictionary> searchByName(String name, Pageable pageable);
//    Optional<Dictionary> findById(Integer id);
//    void remove(Integer id);
//
//




    Page<Dictionary> findAll(Pageable pageable);

    Page<Dictionary> searchByWord(String name, Pageable pageable);

    Optional<Dictionary> findById(Integer id);

    void remove(Integer id);

    Iterable<Dictionary> findAll();

    void save(Dictionary dictionary);
}
