package com.example.tudien.service.impl;

import com.example.tudien.model.Dictionary;
import com.example.tudien.repository.IDictionary;
import com.example.tudien.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DictionaryService implements IDictionaryService {

    @Autowired
    IDictionary iDictionary;

    @Override
    public Page<Dictionary> findAll(Pageable pageable) {
        return iDictionary.findAll(pageable);
    }

    @Override
    public Page<Dictionary> searchByWord(String name, Pageable pageable) {
        return iDictionary.searchByWord(name,pageable);
    }

    @Override
    public Optional<Dictionary> findById(Integer id) {
        return iDictionary.findById(id);
    }

    @Override
    public void remove(Integer id) {
        iDictionary.deleteById(id);
    }

    @Override
    public Iterable<Dictionary> findAll() {
        return iDictionary.findAll();
    }

    @Override
    public void save(Dictionary dictionary) {
        iDictionary.save(dictionary);
    }
}
