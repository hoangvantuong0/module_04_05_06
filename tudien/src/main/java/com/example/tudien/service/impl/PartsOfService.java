package com.example.tudien.service.impl;

import com.example.tudien.model.PartsOf;
import com.example.tudien.repository.IPartsOf;
import com.example.tudien.service.IPartsOfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class PartsOfService implements IPartsOfService {

    @Autowired
    IPartsOf iPartsOf;


    @Override
    public Page<PartsOf> findAll(Pageable pageable) {
        return iPartsOf.findAll(pageable);
    }

    @Override
    public Page<PartsOf> searchByWord(String name, Pageable pageable) {
        return null;
    }

    @Override
    public Optional<PartsOf> findById(Integer id) {
        return iPartsOf.findById(id);
    }

    @Override
    public void remove(Integer id) {
        iPartsOf.deleteById(id);
    }

    @Override
    public Iterable<PartsOf> findAll() {
        return iPartsOf.findAll();
    }

    @Override
    public void save(PartsOf partsOf) {
        iPartsOf.save(partsOf);
    }
}
