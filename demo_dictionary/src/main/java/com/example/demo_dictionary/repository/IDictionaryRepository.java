package com.example.demo_dictionary.repository;

import com.example.demo_dictionary.model.Dictionary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IDictionaryRepository extends JpaRepository<Dictionary, Integer> {

    @Override
    Page< Dictionary > findAll(Pageable pageable);
    // Search by name
    @Query(value = "SELECT * FROM demo_dictionary.dictionary d\n" +
            "where d.word like concat('%',trim(:word), '%')", nativeQuery = true)
    Page< Dictionary > searchByName(@Param("word") String name, Pageable pageable);
}
