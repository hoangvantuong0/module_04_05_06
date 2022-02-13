package com.example.vikordic.repository;

import com.example.vikordic.model.Dictionary;
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
    @Query(value = "SELECT * FROM vikordic.dictionary vd" +
            " where vd.word like concat('%',trim(:word), '%')", nativeQuery = true)
    Page< Dictionary > searchByWord(@Param("word") String name, Pageable pageable);

}
