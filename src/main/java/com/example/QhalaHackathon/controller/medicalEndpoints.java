package com.example.QhalaHackathon.controller;

import com.example.QhalaHackathon.model.MedicalHistory;
import com.example.QhalaHackathon.service.medical_service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.mindrot.jbcrypt.BCrypt;


@RestController
@RequestMapping({"/medical"})
@Slf4j
public class medicalEndpoints extends medical_service {

    @Autowired
    @Qualifier("medical_service")
    private medical_service medicalService;

    public medicalEndpoints(@Qualifier("medical_service") medical_service medicalService) {
        this.medicalService = medicalService;
    }

    @PostMapping("/addMedical")
    public ResponseEntity<String> newMedical(@RequestBody MedicalHistory medicalSample) {

        if(medicalSample != null) {
            // Hash the medicalCondition, diagnosis, and patientId fields before saving
            medicalSample.setMedicalCondition(hashData(medicalSample.getMedicalCondition()));
            medicalSample.setDiagnosis(hashData(medicalSample.getDiagnosis()));

            save(medicalSample);
            return new ResponseEntity<>("Medical History Added Successfully", HttpStatus.CREATED);
        } else {
            // Handle the case where the medical history was not saved
            return new ResponseEntity<>("Failed to add Medical History", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    private String hashData(String data) {
        // Simple hash function using BCrypt for demonstration purposes
        return BCrypt.hashpw(data, BCrypt.gensalt());
    }
}
