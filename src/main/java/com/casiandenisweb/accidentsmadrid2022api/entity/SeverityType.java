package com.casiandenisweb.accidentsmadrid2022api.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "severity_type")
public class SeverityType {
    @Id
    @Column(name = "severity_code")
    private int severityCode;

    private String severity;

    @Column(name = "severity_description")
    private String severityDescription;

    @OneToMany(mappedBy = "severityType", cascade = CascadeType.ALL)
    @JsonIgnoreProperties({"severityType"}) // Exclude severityType property from Passenger
    private List<Passenger> passengers;
}
