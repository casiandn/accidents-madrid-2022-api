package com.casiandenisweb.accidentsmadrid2022api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.casiandenisweb.accidentsmadrid2022api.service.PassengerService;

@RestController
public class PassengerController {

    @Autowired
    PassengerService passengerService;

}
