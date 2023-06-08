package com.casiandenisweb.accidentsmadrid2022api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casiandenisweb.accidentsmadrid2022api.entity.SeverityType;
import com.casiandenisweb.accidentsmadrid2022api.service.SeverityTypeService;

@RestController
public class SeverityTypeController {
    @Autowired
    SeverityTypeService severityTypeService;

    @GetMapping("/severities")
    public List<SeverityType> fetchPassengers(){
        return severityTypeService.findAll();
    }
}
