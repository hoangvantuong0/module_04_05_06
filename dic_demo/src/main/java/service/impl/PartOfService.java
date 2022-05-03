package service.impl;

import model.PartOf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import repository.IPartOfRepository;
import service.IPartOfService;

import java.util.Optional;

@Service
public class PartOfService implements IPartOfService {

    @Autowired
    IPartOfRepository partOfRepository;

    @Override
    public Page<PartOf> findAll(Pageable pageable) {
        return partOfRepository.findAll(pageable);
    }

    @Override
    public Page<PartOf> search(String name, Pageable pageable) {
        return null;
    }

    @Override
    public Optional<PartOf> findById(Integer id) {
        return partOfRepository.findById(id);
    }

    @Override
    public void remove(Integer id) {
        partOfRepository.deleteById(id);
    }

    @Override
    public Iterable<PartOf> findAll() {
        return partOfRepository.findAll();
    }

    @Override
    public void save(PartOf partOf) {
        partOfRepository.save(partOf);
    }
}
