package com.example.QhalaHackathon.controller;

import com.example.QhalaHackathon.model.Hospital;
import com.example.QhalaHackathon.service.hospital_service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/hospital"})
@Slf4j
public class hospitalEndpoints extends hospital_service {

    @Qualifier("hospital_service")
    @Autowired
    private hospital_service hospitalService;

    public hospitalEndpoints(@Qualifier("hospital_service") hospital_service hospitalService) {
        this.hospitalService = hospitalService;
    }

    @PostMapping("/addHospital")
    public ResponseEntity<String> newHospital(@RequestBody Hospital sampleHospital) {

        if(sampleHospital != null) {
            save(sampleHospital);
            return new ResponseEntity<>("Hospital Added Successfully", HttpStatus.CREATED);
        } else {
            // Handle the case where the patient was not saved
            return new ResponseEntity<>("Failed to add Hospital", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



}
