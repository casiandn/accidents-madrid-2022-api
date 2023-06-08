package com.casiandenisweb.accidentsmadrid2022api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casiandenisweb.accidentsmadrid2022api.entity.Passenger;
import com.casiandenisweb.accidentsmadrid2022api.service.PassengerService;

@RestController
public class PassengerController {

    @Autowired
    PassengerService passengerService;

    @GetMapping("/passengers")
    public List<Passenger> fetchPassengers(){
        return passengerService.findAll();
    }
}
