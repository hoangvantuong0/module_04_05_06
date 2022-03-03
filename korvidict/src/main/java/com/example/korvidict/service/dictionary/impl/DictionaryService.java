package com.example.korvidict.service.dictionary.impl;

import com.example.korvidict.model.Dictionary;
import com.example.korvidict.repository.IDictionaryRepository;
import com.example.korvidict.service.IDictionaryService;
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
    public Page<Dictionary> findAll(Pageable pageable) {
        return dictionaryRepository.findAll(pageable);
    }

    @Override
    public Page<Dictionary> searchByWord(String name, Pageable pageable) {
        return dictionaryRepository.searchByWord(name, pageable);
    }

    @Override
    public Optional<Dictionary> findById(Integer id) {
        return dictionaryRepository.findById(id);
    }

    @Override
    public void remove(Integer id) {
        dictionaryRepository.deleteById(id);
    }

    @Override
    public Iterable<Dictionary> findAll() {
        return dictionaryRepository.findAll();
    }

    @Override
    public void save(Dictionary dictionary) {
        dictionaryRepository.save(dictionary);
    }


}
