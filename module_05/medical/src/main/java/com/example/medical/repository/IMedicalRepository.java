package com.example.medical.repository;

import com.example.medical.model.Medical;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMedicalRepository extends JpaRepository<Medical, Integer > {
}