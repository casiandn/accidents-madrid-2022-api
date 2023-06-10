package com.casiandenisweb.accidentsmadrid2022api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casiandenisweb.accidentsmadrid2022api.entity.SeverityType;
import com.casiandenisweb.accidentsmadrid2022api.error.InjuryNotFoundException;
import com.casiandenisweb.accidentsmadrid2022api.repository.SeverityTypeRepository;

@Service
public class SeverityTypeServiceImplementation implements SeverityTypeService {

    @Autowired
    SeverityTypeRepository severityTypeRepository;

    public SeverityType findSeverityTypeByseverityCode(int severityCode) throws InjuryNotFoundException {
        SeverityType severityType = severityTypeRepository.findSeverityTypeByseverityCode(severityCode);
        if (severityType == null) {
            throw new InjuryNotFoundException("Severity type not found for severity code: " + severityCode);
        }
        return severityType;
    }

    @Override
    public List<SeverityType> findSeverityTypeByseverity(String severity) {
        return severityTypeRepository.findSeverityTypeByseverity(severity);
    }

    public List<SeverityType> findAll() {
        return severityTypeRepository.findAll();
    }
}
