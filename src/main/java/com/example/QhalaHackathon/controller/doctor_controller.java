package com.example.QhalaHackathon.controller;

import com.example.QhalaHackathon.entity.doctor;
import com.example.QhalaHackathon.entity.hospital;
import com.example.QhalaHackathon.implementation.doctor_implementation;
import com.example.QhalaHackathon.implementation.hospital_implementation;
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
@RequestMapping({"/doctor"})
@Slf4j
public class doctor_controller extends doctor_implementation {

    @Autowired
    @Qualifier("doctor_implementation")
    doctor_implementation doctorImplementation;

    @PostMapping("/addDoctor")
    public ResponseEntity<String> newDoctor(@RequestBody doctor sampleDoctor) {

        if(sampleDoctor != null) {
            save(sampleDoctor);
            return new ResponseEntity<>("Doctor Added Successfully", HttpStatus.CREATED);
        } else {
            // Handle the case where the patient was not saved
            return new ResponseEntity<>("Failed to add Doctor", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
