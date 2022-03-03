package com.example.vikordic.repository;

import com.example.vikordic.model.PartsOfSpeech;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPartsOfSpeechRepository extends JpaRepository<PartsOfSpeech, Integer> {
}
