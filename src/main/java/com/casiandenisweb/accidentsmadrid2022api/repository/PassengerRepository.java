package com.casiandenisweb.accidentsmadrid2022api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.casiandenisweb.accidentsmadrid2022api.models.Passenger;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long>{
    
}
