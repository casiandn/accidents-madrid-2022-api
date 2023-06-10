package com.casiandenisweb.accidentsmadrid2022api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casiandenisweb.accidentsmadrid2022api.service.AccidentService;

@RestController
@RequestMapping("/statistics")
public class StatisticsController {

    @Autowired
    AccidentService accidentService;


    @GetMapping("/total_accidents")
    public long getTotalAccidents() {
        return accidentService.count();
    }

    @GetMapping("/common_types")
    public List<Object[]> getMostCommonAccidentTypes() {
        return accidentService.findMostCommonAccidentTypes();
    }

    @GetMapping("/accidents_by_district")
    public List<Object[]> getAccidentsByDistrict() {
        return accidentService.groupAccidentsByDistrict();
    }

    @GetMapping("/accidents_by_injury")
    public List<Object[]> getAccidentsBySeverity() {
        return accidentService.groupAccidentsBySeverity();
    }
}

