package com.casiandenisweb.accidentsmadrid2022api.service;

import java.util.List;

import com.casiandenisweb.accidentsmadrid2022api.entity.SeverityType;
import com.casiandenisweb.accidentsmadrid2022api.error.InjuryNotFoundException;

public interface SeverityTypeService {


    SeverityType findSeverityTypeByseverityCode(int severityCode) throws InjuryNotFoundException;

    List<SeverityType> findAll();

    List<SeverityType> findSeverityTypeByseverity(String severity);
    
}