package com.casiandenisweb.accidentsmadrid2022api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casiandenisweb.accidentsmadrid2022api.entity.Accident;

public interface AccidentRepository extends JpaRepository<Accident, String> {
}
