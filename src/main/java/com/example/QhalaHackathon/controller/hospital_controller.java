package com.example.QhalaHackathon.controller;

import com.example.QhalaHackathon.entity.hospital;
import com.example.QhalaHackathon.entity.patient;
import com.example.QhalaHackathon.implementation.hospital_implementation;
import com.example.QhalaHackathon.implementation.patient_implementation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/hospital"})
@Slf4j
public class hospital_controller extends hospital_implementation {

    @Autowired
    private hospital_implementation hospitalImplementation;

    public hospital_controller(hospital_implementation hospitalImplementation) {
        this.hospitalImplementation = hospitalImplementation;
    }

    @PostMapping("/addHospital")
    public ResponseEntity<String> newHospital(@RequestBody hospital sampleHospital) {

        if(sampleHospital != null) {
            save(sampleHospital);
            return new ResponseEntity<>("Hospital Added Successfully", HttpStatus.CREATED);
        } else {
            // Handle the case where the patient was not saved
            return new ResponseEntity<>("Failed to add Hospital", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



}
