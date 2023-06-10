package com.casiandenisweb.accidentsmadrid2022api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casiandenisweb.accidentsmadrid2022api.entity.SeverityType;

public interface SeverityTypeRepository extends JpaRepository<SeverityType, String> {
    public SeverityType findSeverityTypeByseverityCode(int severityCode);
    public List<SeverityType> findSeverityTypeByseverity(String severity);
}
