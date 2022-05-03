package service;

import model.Dic;
import model.PartOf;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IPartOfService {

    Page<PartOf> findAll(Pageable pageable);
    Page<PartOf> search(String name, Pageable pageable);
    Optional<PartOf> findById(Integer id);
    void remove (Integer id);
    Iterable<PartOf> findAll();
    void save(PartOf partOf);
}
