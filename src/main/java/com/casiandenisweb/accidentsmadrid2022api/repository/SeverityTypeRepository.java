package com.casiandenisweb.accidentsmadrid2022api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casiandenisweb.accidentsmadrid2022api.entity.SeverityType;

public interface SeverityTypeRepository extends JpaRepository<SeverityType, String> {
    
}
