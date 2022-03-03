package com.example.korvidict.repository;

import com.example.korvidict.model.PartsOfSpeech;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPartsOfSpeechRepository extends JpaRepository<PartsOfSpeech, Integer> {
}
