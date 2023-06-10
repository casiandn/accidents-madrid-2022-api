package com.casiandenisweb.accidentsmadrid2022api.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
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
@Table(name = "Accidents")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "recordNumber")
public class Accident {
    @Id
    @Column(name = "record_number")
    private String recordNumber;

    private String date;

    private String time;

    private String location;

    private String number;

    @Column(name = "district_code")
    private int districtCode;

    private String district;

    @Column(name = "accident_type")
    private String accidentType;

    @Column(name = "weather_condition")
    private String weatherCondition;

    @Column(name = "coordinate_x_utm")
    private String coordinateXUtm;

    @Column(name = "coordinate_y_utm")
    private String coordinateYUtm;

    @OneToMany(targetEntity = Passenger.class, cascade = CascadeType.ALL, mappedBy = "accident")
    private List<Passenger> passengers;

}
