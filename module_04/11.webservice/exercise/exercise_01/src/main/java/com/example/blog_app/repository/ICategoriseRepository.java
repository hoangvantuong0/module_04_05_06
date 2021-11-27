package com.example.blog_app.repository;

import com.example.blog_app.model.Categorise;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoriseRepository extends JpaRepository<Categorise, Integer> {

}