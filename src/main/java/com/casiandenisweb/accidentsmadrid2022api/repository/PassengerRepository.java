package com.casiandenisweb.accidentsmadrid2022api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.casiandenisweb.accidentsmadrid2022api.entity.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long>{
    
}
