package com.example.exercise_02.repository;

import com.example.exercise_02.model.Categorise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoriseRepository extends JpaRepository<Categorise, Integer> {

}