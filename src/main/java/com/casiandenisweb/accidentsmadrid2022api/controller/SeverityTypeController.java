package com.casiandenisweb.accidentsmadrid2022api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.casiandenisweb.accidentsmadrid2022api.entity.SeverityType;
import com.casiandenisweb.accidentsmadrid2022api.error.InjuryNotFoundException;
import com.casiandenisweb.accidentsmadrid2022api.service.SeverityTypeService;

@RestController
public class SeverityTypeController {
    @Autowired
    SeverityTypeService severityTypeService;

    @GetMapping("/injuries/severityCode/{injuryCode}")
    public SeverityType fetchInjuryBySeverityCode(@PathVariable("injuryCode") int severityCode) throws InjuryNotFoundException{
        return severityTypeService.findSeverityTypeByseverityCode(severityCode);
    }
    
    @GetMapping("/injuries/severityType/{type}")
    public List<SeverityType> fetchInjuryBySeverity(@PathVariable("type") String severity){
        return severityTypeService.findSeverityTypeByseverity(severity);
    }

    @GetMapping("/injuries")
    public List<SeverityType> fetchInjuries(){
        return severityTypeService.findAll();
    }
}
