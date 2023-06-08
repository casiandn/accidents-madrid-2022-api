package com.casiandenisweb.accidentsmadrid2022api.service;

import java.util.List;

import com.casiandenisweb.accidentsmadrid2022api.entity.Accident;
import com.casiandenisweb.accidentsmadrid2022api.error.AccidentNotFoundException;

public interface AccidentService {
    public static final int SIZE = 10;

    public Accident findAccidentByRecordNumber(String recordNumber) throws AccidentNotFoundException;

    public List<Accident> findAll(Integer page, Integer size);
}
