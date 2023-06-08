package com.casiandenisweb.accidentsmadrid2022api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casiandenisweb.accidentsmadrid2022api.entity.SeverityType;
import com.casiandenisweb.accidentsmadrid2022api.repository.SeverityTypeRepository;

@Service
public class SeverityTypeServiceImplementation implements SeverityTypeService {
    
    @Autowired
    SeverityTypeRepository severityTypeRepository;

    @Override
    public List<SeverityType> findAll() {
        return severityTypeRepository.findAll();
    }
    
}
