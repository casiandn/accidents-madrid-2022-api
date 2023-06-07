package com.casiandenisweb.accidentsmadrid2022api.service;

import java.util.List;

import com.casiandenisweb.accidentsmadrid2022api.error.AccidentNotFoundException;
import com.casiandenisweb.accidentsmadrid2022api.models.Accident;

public interface AccidentService {
    public static final int SIZE = 10;

    public List<Accident> findAllDetailed(int page, int size);

    public Accident findAccidentByRecordNumber(String recordNumber) throws AccidentNotFoundException;

    public List<Accident> findAll(Integer page, Integer size);
}
