package com.example.furama.service.services;

import com.example.furama.model.services.Services;
import com.example.furama.service.IGeneralService;


import java.util.Optional;

public interface IServiceService extends IGeneralService<Services> {
    Optional<Services> findById(String id);
}
