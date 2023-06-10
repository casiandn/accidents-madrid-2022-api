package com.casiandenisweb.accidentsmadrid2022api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casiandenisweb.accidentsmadrid2022api.entity.Passenger;
import com.casiandenisweb.accidentsmadrid2022api.repository.PassengerRepository;

@Service
public class PassengerServiceImplementation implements PassengerService {

    @Autowired
    PassengerRepository passengerRepository;

    @Override
    public List<Passenger> findAll() {
        return passengerRepository.findAll();
    }
    
}
