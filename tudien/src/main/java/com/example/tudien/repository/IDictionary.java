package com.example.tudien.repository;

import com.example.tudien.model.Dictionary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IDictionary extends JpaRepository<Dictionary, Integer> {


    @Override
    Page<Dictionary> findAll(Pageable pageable);
    // Search by name
    @Query(value = "SELECT * FROM tudien.dictionary td" +
            " where td.word like concat('%',trim(:word), '%') or td.mean like concat('%',trim(:word), '%') "
//            + "or td.sino like concat('%',trim(:word), '%')"
            , nativeQuery = true)
    Page< Dictionary > searchByWord(@Param("word") String name, Pageable pageable);
}
