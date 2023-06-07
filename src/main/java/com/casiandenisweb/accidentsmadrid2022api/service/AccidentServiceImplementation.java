package com.casiandenisweb.accidentsmadrid2022api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.casiandenisweb.accidentsmadrid2022api.error.AccidentNotFoundException;
import com.casiandenisweb.accidentsmadrid2022api.models.Accident;
import com.casiandenisweb.accidentsmadrid2022api.repository.AccidentRepository;

@Service
public class AccidentServiceImplementation implements AccidentService {
    @Autowired
    private AccidentRepository accidentRepository;

    @Override
    public List<Accident> findAll(Integer page, Integer size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Accident> accidentsPage = accidentRepository.findAll(pageable);
        return accidentsPage.getContent();
    }

    @Override
    public List<Accident> findAllDetailed(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Accident> accidentsPage = accidentRepository.findAllWithPassengersAndSeverity(pageable);
        return accidentsPage.getContent();

    }

    public Accident findAccidentByRecordNumber(String recordNumber) throws AccidentNotFoundException {
        Optional<Accident> optionalAccident = accidentRepository.findById(recordNumber);
        if (!optionalAccident.isPresent()) {
            throw new AccidentNotFoundException("Accident not found");
        }
        return optionalAccident.get();
    }

}
