package com.casiandenisweb.accidentsmadrid2022api.service;

import java.util.List;

import com.casiandenisweb.accidentsmadrid2022api.models.SeverityType;

public interface SeverityTypeService {

    List<SeverityType> findAll();
    
}