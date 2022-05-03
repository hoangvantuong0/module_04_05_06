package repository;

import model.Dic;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IDicRepository extends JpaRepository<Dic, Integer> {

    @Override
    Page<Dic> findAll(Pageable pageable);
    // Search by name
    @Query(value = "SELECT * FROM dic2022.dic d" +
            " where d.word like concat('%',trim(:word), '%') or d.mean like concat('%',trim(:word), '%') ",
            nativeQuery = true)
    Page< Dic > search(@Param("word") String name, Pageable pageable);

}
