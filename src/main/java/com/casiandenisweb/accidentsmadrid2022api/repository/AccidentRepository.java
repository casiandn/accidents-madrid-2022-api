package com.casiandenisweb.accidentsmadrid2022api.repository;


import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.casiandenisweb.accidentsmadrid2022api.models.Accident;

@Repository
public interface AccidentRepository extends JpaRepository<Accident, String>{
    // joins all 3 tables and return a list of them.
    @Query("SELECT a FROM Accident a JOIN FETCH a.passengers p JOIN FETCH p.severityType order by date,time asc")
    Page<Accident> findAllWithPassengersAndSeverity(Pageable pageable);

}
