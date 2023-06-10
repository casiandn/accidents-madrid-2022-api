package com.casiandenisweb.accidentsmadrid2022api.service;

import java.util.List;

import com.casiandenisweb.accidentsmadrid2022api.entity.Accident;
import com.casiandenisweb.accidentsmadrid2022api.error.AccidentNotFoundException;

public interface AccidentService {
    public static final String SIZE = "10";

    public Accident findAccidentByRecordNumber(String recordNumber) throws AccidentNotFoundException;

    public List<Accident> findAll(Integer page, Integer size);

    public List<Accident> findAllAccidentByDate(String recordNumber);

    public List<Accident> findAllAccidentByDistrictCode(int districtCode);

    public List<Accident> findAllAccidentByAccidentType(String accidentType);

    public List<Accident> findAllAccidentByWeatherCondition(String weatherCondition);

    public List<Accident> findAllAccidentByPositiveAlcohol(String positive);

    public long count();

    public List<Object[]> findMostCommonAccidentTypes();

    public List<Object[]> groupAccidentsByDistrict();

    public List<Object[]> groupAccidentsBySeverity();
}
