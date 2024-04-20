package com.example.QhalaHackathon.controller;

import com.example.QhalaHackathon.entity.patient;
import com.example.QhalaHackathon.implementation.patient_implementation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping({"/api"})
@Slf4j
public class patient_controller extends  patient_implementation {

    @Autowired
    private patient_implementation patientImplementation;

    public patient_controller(patient_implementation patientImplementation) {
        this.patientImplementation = patientImplementation;
    }

    @GetMapping("/get")
    public String getPatients() {
        // Your logic to get patients
        return null;
    }

    @PostMapping("/add")
    public patient newPatient(@RequestBody patient patient) {
            return addSamplePatient(patient);
    }
}
