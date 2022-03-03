package com.example.korvidict.service.dictionary.impl;

import com.example.korvidict.model.PartsOfSpeech;
import com.example.korvidict.repository.IPartsOfSpeechRepository;
import com.example.korvidict.service.IPartsOfSpeechService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PartsOfSpeechService implements IPartsOfSpeechService {

    @Autowired
    IPartsOfSpeechRepository partsOfSpeechRepository;


    @Override
    public Page<PartsOfSpeech> findAll(Pageable pageable) {
        return partsOfSpeechRepository.findAll(pageable);
    }

    @Override
    public Page<PartsOfSpeech> searchByWord(String name, Pageable pageable) {
        return null;
    }

    @Override
    public Optional<PartsOfSpeech> findById(Integer id) {
        return partsOfSpeechRepository.findById(id);
    }

    @Override
    public void remove(Integer id) {
        partsOfSpeechRepository.deleteById(id);
    }

    @Override
    public Iterable<PartsOfSpeech> findAll() {
        return partsOfSpeechRepository.findAll();
    }

    @Override
    public void save(PartsOfSpeech partsOfSpeech) {
        partsOfSpeechRepository.save(partsOfSpeech);
    }
}
