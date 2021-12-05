package com.example.furama.service.contract;

import com.example.furama.model.contract.Contract;
import com.example.furama.service.IGeneralService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IContractService extends IGeneralService<Contract> {
    public Page<Contract> findAll(Pageable pageable);
}
