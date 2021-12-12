package com.example.final_exam.repository;

import com.example.final_exam.model.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFilmRepository extends JpaRepository<Film, String> {

}
