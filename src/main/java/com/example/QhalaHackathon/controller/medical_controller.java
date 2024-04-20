package com.example.QhalaHackathon.controller;

import com.example.QhalaHackathon.entity.hospital;
import com.example.QhalaHackathon.entity.medical_history;
import com.example.QhalaHackathon.implementation.hospital_implementation;
import com.example.QhalaHackathon.implementation.medical_implementation;
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
@RequestMapping({"/medical"})
@Slf4j
public class medical_controller extends medical_implementation {

    @Autowired
    @Qualifier("medical_implementation")
    private medical_implementation medicalImplementation;

    public medical_controller(medical_implementation medicalImplementation) {
        this.medicalImplementation = medicalImplementation;
    }

    @PostMapping("/addMedical")
    public ResponseEntity<String> newMedical(@RequestBody medical_history medicalSample) {

        if(medicalSample != null) {
            save(medicalSample);
            return new ResponseEntity<>("Medical History Added Successfully", HttpStatus.CREATED);
        } else {
            // Handle the case where the patient was not saved
            return new ResponseEntity<>("Failed to add Medical History", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
