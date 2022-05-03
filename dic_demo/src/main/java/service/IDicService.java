package service;

import model.Dic;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IDicService {
    Page<Dic> findAll(Pageable pageable);
    Page<Dic> search(String name, Pageable pageable);
    Optional<Dic> findById(Integer id);
    void remove (Integer id);
    Iterable<Dic> findAll();
    void save(Dic dic);
}
