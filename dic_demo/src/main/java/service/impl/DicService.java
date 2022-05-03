package service.impl;

import model.Dic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import repository.IDicRepository;
import service.IDicService;

import java.util.Optional;

@Service
public class DicService implements IDicService {

    @Autowired
    IDicRepository iDicRepository;


    @Override
    public Page<Dic> findAll(Pageable pageable) {
        return iDicRepository.findAll(pageable);
    }

    @Override
    public Page<Dic> search(String name, Pageable pageable) {
        return iDicRepository.search(name, pageable);
    }

    @Override
    public Optional<Dic> findById(Integer id) {
        return iDicRepository.findById(id);
    }

    @Override
    public void remove(Integer id) {
        iDicRepository.deleteById(id);
    }

    @Override
    public Iterable<Dic> findAll() {
        return iDicRepository.findAll();
    }

    @Override
    public void save(Dic dic) {
        iDicRepository.save(dic);
    }
}
