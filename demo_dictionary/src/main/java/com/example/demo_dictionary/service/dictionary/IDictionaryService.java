package com.example.demo_dictionary.service.dictionary;

import com.example.demo_dictionary.model.Dictionary;
import com.example.demo_dictionary.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface IDictionaryService extends IGeneralService<Dictionary> {
    Page<Dictionary> findAll(Pageable pageable);
    Page<Dictionary> searchByName(String name, Pageable pageable);
    Optional<Dictionary> findById(Integer id);
    void remove(Integer id);
}
