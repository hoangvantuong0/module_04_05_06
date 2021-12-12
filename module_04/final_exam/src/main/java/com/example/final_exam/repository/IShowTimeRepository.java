package com.example.final_exam.repository;

import com.example.final_exam.model.ShowTime;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IShowTimeRepository extends JpaRepository<ShowTime, String> {

    @Override
    Page< ShowTime > findAll(Pageable pageable);
    // Search by name
    @Query(value = "select * from final_exam.film \n" +
            "join final_exam.show_time\n" +
            "on film.id = show_time.film_id\n" +
            "where film.`name` like concat('%',:name, '%')", nativeQuery = true)
    Page< ShowTime > searchByName(@Param("name") String name, Pageable pageable);
    boolean existsById(String id);
//    Boolean existsByName(String name);
}
