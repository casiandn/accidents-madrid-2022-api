package com.casiandenisweb.accidentsmadrid2022api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casiandenisweb.accidentsmadrid2022api.entity.Accident;

public interface AccidentRepository extends JpaRepository<Accident, String> {

    List<Accident> findAllAccidentByDate(String date);

    List<Accident> findAllAccidentByDistrictCode(int districtCode);

    List<Accident> findAllAccidentByAccidentType(String accidentType);
}
