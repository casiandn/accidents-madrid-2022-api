package com.casiandenisweb.accidentsmadrid2022api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.casiandenisweb.accidentsmadrid2022api.entity.Accident;
import com.casiandenisweb.accidentsmadrid2022api.error.AccidentNotFoundException;
import com.casiandenisweb.accidentsmadrid2022api.service.AccidentService;

@RestController
public class AccidentController {

    @Autowired
    private AccidentService accidentService;

    @GetMapping("/accidents")
    public List<Accident> fetchAccidentList(
            @RequestParam(required = false, defaultValue = "0") int page,
            @RequestParam(required = false, defaultValue = AccidentService.SIZE) int size) {
        return accidentService.findAll(page, size);
    }

    @GetMapping("/accidents/date")
    public List<Accident> fetchAccidentListByDate(@RequestParam(required = true) String date) {
        return accidentService.findAllAccidentByDate(date);
    }

    @GetMapping("/accidents/districtCode/{districtCode}")
    public List<Accident> fetchAccidentListByDistrict(@PathVariable(required = true) int districtCode) {
        return accidentService.findAllAccidentByDistrictCode(districtCode);
    }

    @GetMapping("/accidents/accidentType/{accidentType}")
    public List<Accident> fetchAccidentListByAccidentType(@PathVariable(required = true) String accidentType) {
        return accidentService.findAllAccidentByAccidentType(accidentType);
    }

    @GetMapping("/accidents/weatherCondition/{weatherCondition}")
    public List<Accident> fetchAccidentListByWeatherCondition(@PathVariable(required = true) String weatherCondition) {
        return accidentService.findAllAccidentByWeatherCondition(weatherCondition);
    }

    @GetMapping("/accidents/alcoholPositive")
    public List<Accident> fetchAccidentListByAlcoholPositive(@RequestParam(required = false, defaultValue = "n") String positive) {
        return accidentService.findAllAccidentByPositiveAlcohol(positive);
    }

    @GetMapping("/accidents/{recordNumber}")
    public Accident fetchAccidentList(@PathVariable(required = true) String recordNumber)
            throws AccidentNotFoundException {
        return accidentService.findAccidentByRecordNumber(recordNumber);
    }

}
