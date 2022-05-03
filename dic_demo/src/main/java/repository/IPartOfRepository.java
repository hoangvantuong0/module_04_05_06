package repository;

import model.PartOf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPartOfRepository extends JpaRepository<PartOf, Integer>{
}
