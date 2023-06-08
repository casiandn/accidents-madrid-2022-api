package com.casiandenisweb.accidentsmadrid2022api.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(targetEntity = Accident.class)
    @JoinColumn(name = "record_number")
    @JsonIdentityReference(alwaysAsId = true) // Refer to Accident by its ID
    private Accident accident;

    @Column(name = "person_type")
    private String personType;

    @Column(name = "age_range")
    private String ageRange;

    private String gender;

    @ManyToOne
    @JoinColumn(name = "severity_code")
    @JsonIgnoreProperties("passengers") // Exclude passenger from severityType
    private SeverityType severityType;

    @Column(name = "positive_alcohol")
    private String positiveAlcohol;

    private String vehicleType;
}
