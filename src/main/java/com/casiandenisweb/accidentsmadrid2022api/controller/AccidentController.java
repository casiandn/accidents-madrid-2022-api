package com.casiandenisweb.accidentsmadrid2022api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.casiandenisweb.accidentsmadrid2022api.entity.Accident;
import com.casiandenisweb.accidentsmadrid2022api.error.AccidentNotFoundException;
import com.casiandenisweb.accidentsmadrid2022api.service.AccidentService;

@RestController
public class AccidentController {

    @Autowired
    private AccidentService accidentService;

    @GetMapping("/accidents")
    public List<Accident> fetchAccidentList(
            @RequestParam(required = false) Integer page,
            @RequestParam(required = false) Integer size) {
        if (page != null) {
            if (size == null) {
                size = AccidentService.SIZE; // Use the default size if it's not provided
            }
            // Use both page and size parameters for pagination
            return accidentService.findAll(page, size);
        }
        // Return first page
        return accidentService.findAll(0, AccidentService.SIZE);
    }

    @GetMapping("/accidents/{recordNumber}")
    public Accident fetchAccidentList(@PathVariable(required = true) String recordNumber)
            throws AccidentNotFoundException {
        return accidentService.findAccidentByRecordNumber(recordNumber);
    }

}
