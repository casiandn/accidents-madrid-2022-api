package com.casiandenisweb.accidentsmadrid2022api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.casiandenisweb.accidentsmadrid2022api.entity.Accident;
import com.casiandenisweb.accidentsmadrid2022api.error.AccidentNotFoundException;
import com.casiandenisweb.accidentsmadrid2022api.repository.AccidentRepository;

@Service
public class AccidentServiceImplementation implements AccidentService {
    @Autowired
    private AccidentRepository accidentRepository;

    @Override
    public List<Accident> findAll(Integer page, Integer size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Accident> accidentsPage = accidentRepository.findAll(pageable);
        return accidentsPage.getContent();
    }

    public Accident findAccidentByRecordNumber(String recordNumber) throws AccidentNotFoundException {
        Optional<Accident> optionalAccident = accidentRepository.findById(recordNumber);
        if (!optionalAccident.isPresent()) {
            throw new AccidentNotFoundException("Accident not found");
        }
        return optionalAccident.get();
    }

    @Override
    public List<Accident> findAllAccidentByDate(String date) {
        return accidentRepository.findAllAccidentByDate(date);
    }

    @Override
    public List<Accident> findAllAccidentByDistrictCode(int districtCode) {
        return accidentRepository.findAllAccidentByDistrictCode(districtCode);
    }

    @Override
    public List<Accident> findAllAccidentByAccidentType(String accidentType) {
        return accidentRepository.findAllAccidentByAccidentType(accidentType);
    }

    @Override
    public List<Accident> findAllAccidentByWeatherCondition(String weatherCondition) {
        return accidentRepository.findAllAccidentByWeatherCondition(weatherCondition);
    }

    @Override
    public List<Accident> findAllAccidentByPositiveAlcohol(String positive) {
        return accidentRepository.findAllAccidentByPassengersPositiveAlcoholAndPassengersPersonType(positive, "conductor");
    }

    // statistics

    @Override
    public long count() {
        return accidentRepository.count();
    }

    @Override
    public List<Object[]> findMostCommonAccidentTypes() {
        return accidentRepository.findMostCommonAccidentTypes();
    }

    @Override
    public List<Object[]> groupAccidentsByDistrict() {
        return accidentRepository.groupAccidentByDistrict();
    }

    @Override
    public List<Object[]> groupAccidentsBySeverity() {
        return accidentRepository.groupAccidentsBySeverity();
    }

}
