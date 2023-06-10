package com.casiandenisweb.accidentsmadrid2022api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.casiandenisweb.accidentsmadrid2022api.entity.Accident;

public interface AccidentRepository extends JpaRepository<Accident, String> {

    List<Accident> findAllAccidentByDate(String date);

    List<Accident> findAllAccidentByDistrictCode(int districtCode);

    List<Accident> findAllAccidentByAccidentType(String accidentType);

    List<Accident> findAllAccidentByWeatherCondition(String weatherCondition);

    List<Accident> findAllAccidentByPassengersPositiveAlcoholAndPassengersPersonType(String positiveAlcohol,
            String personType);

    // statistics

    @Query("SELECT a.accidentType, COUNT(a) FROM Accident a GROUP BY a.accidentType ORDER BY COUNT(a) DESC")
    List<Object[]> findMostCommonAccidentTypes();

    @Query("SELECT a.district, COUNT(a) FROM Accident a GROUP BY a.district order by 2 desc")
    List<Object[]> groupAccidentByDistrict();

    @Query("SELECT s.severity, COUNT(p) FROM Accident a JOIN a.passengers p JOIN p.severityType s GROUP BY s.severity")
    List<Object[]> groupAccidentsBySeverity();

}
