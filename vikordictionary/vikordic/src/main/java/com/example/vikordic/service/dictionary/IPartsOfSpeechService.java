package com.example.vikordic.service.dictionary;

import com.example.vikordic.model.PartsOfSpeech;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;


public interface IPartsOfSpeechService extends IGeneralService<PartsOfSpeech>{
    Page<PartsOfSpeech> findAll(Pageable pageable);

    Page<PartsOfSpeech> searchByWord(String name, Pageable pageable);

    Optional<PartsOfSpeech> findById(Integer id);

    void remove(Integer id);

    Iterable<PartsOfSpeech> findAll();

    void save(PartsOfSpeech partsOfSpeech);

}
