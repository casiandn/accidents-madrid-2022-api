package com.casiandenisweb.accidentsmadrid2022api.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "Passengers")
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(targetEntity = Accident.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "record_number")
    @JsonBackReference
    private Accident accident;

    @Column(name = "person_type")
    private String personType;

    @Column(name = "age_range")
    private String ageRange;

    private String gender;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "severity_code")
    @JsonBackReference
    private SeverityType severityType;

    @Column(name = "positive_alcohol")
    private String positiveAlcohol;

    private String vehicleType;
}
