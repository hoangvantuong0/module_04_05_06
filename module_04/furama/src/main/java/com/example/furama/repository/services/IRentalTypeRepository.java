package com.example.furama.repository.services;

import com.example.furama.model.services.RentalType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRentalTypeRepository extends JpaRepository<RentalType, Integer> {
}
