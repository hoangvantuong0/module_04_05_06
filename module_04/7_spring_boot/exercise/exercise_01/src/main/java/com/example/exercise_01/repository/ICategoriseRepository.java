package com.example.exercise_01.repository;

import com.example.exercise_01.model.Categorise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoriseRepository extends JpaRepository<Categorise, Integer> {

}