package com.example.demo_dictionary.service.dictionary.impl;

import com.example.demo_dictionary.model.Dictionary;
import com.example.demo_dictionary.repository.IDictionaryRepository;
import com.example.demo_dictionary.service.dictionary.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DictionaryService implements IDictionaryService {
    @Autowired
    IDictionaryRepository dictionaryRepository;


    @Override
    public Iterable<Dictionary> findAll() {
        return dictionaryRepository.findAll();
    }

    @Override
    public void save(Dictionary dictionary) {
        dictionaryRepository.save(dictionary);
    }

    @Override
    public Page<Dictionary> findAll(Pageable pageable) {
        return dictionaryRepository.findAll(pageable);
    }

    @Override
    public Page<Dictionary> searchByName(String name, Pageable pageable) {
        return dictionaryRepository.searchByName(name, pageable);
    }

    @Override
    public Optional<Dictionary> findById(Integer id) {
        return dictionaryRepository.findById(id);
    }

    @Override
    public void remove(Integer id) {
        dictionaryRepository.deleteById(id);
    }
}
