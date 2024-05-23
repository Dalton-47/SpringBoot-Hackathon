package com.example.QhalaHackathon.controller;

import com.example.QhalaHackathon.model.Patient;
import com.example.QhalaHackathon.service.patient_service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping({"/api"})
@Slf4j
public class patientEndpoints extends patient_service {

    @Qualifier("patient_service")
    @Autowired
    private patient_service patientService;

    public patientEndpoints(@Qualifier("patient_service") patient_service patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/")
    public void getPatients() {
        findAll();
    }

    @PostMapping("/addPatient")
    public ResponseEntity<String> newPatient(@RequestBody Patient samplePatient) {

        if(samplePatient != null) {
            save(samplePatient);
            return new ResponseEntity<>("Patient Added Successfully", HttpStatus.CREATED);
        } else {
            // Handle the case where the patient was not saved
            return new ResponseEntity<>("Failed to add patient", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/getPatientByIdentificationNumber/{identificationNumber}")
    public ResponseEntity<Optional<Patient>> getPatientByIdentificationNumber(@PathVariable String identificationNumber) {
        Optional<Patient> foundPatient = patientService.findByidentificationNumber(identificationNumber);

        if (foundPatient.isPresent()) {
            return new ResponseEntity<>(foundPatient, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


}
