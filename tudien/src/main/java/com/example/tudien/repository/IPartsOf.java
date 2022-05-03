package com.example.tudien.repository;

import com.example.tudien.model.PartsOf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPartsOf extends JpaRepository<PartsOf, Integer> {
}
