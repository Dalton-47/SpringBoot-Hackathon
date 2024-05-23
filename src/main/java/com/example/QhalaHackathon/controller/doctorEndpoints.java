package com.example.QhalaHackathon.controller;

import com.example.QhalaHackathon.dto.DoctorHospitalDTO;
import com.example.QhalaHackathon.model.Doctor;
import com.example.QhalaHackathon.service.DoctorService;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping({"/doctor"})
@Slf4j
@NoArgsConstructor
public class doctorEndpoints extends DoctorService {


    @Autowired
    DoctorService doctorService;

    @GetMapping("/")
    public ResponseEntity<List<DoctorHospitalDTO>> getDoctors() {
        List<DoctorHospitalDTO> doctors = doctorService.getAllDoctorsHospital();
        return new ResponseEntity<>(doctors, HttpStatus.OK);
    }


    @PostMapping("/addDoctor")
    public ResponseEntity<Doctor> addDoctor(@RequestBody Doctor doctor, @RequestParam Long hospitalId) {
        Doctor createdDoctor = doctorService.createDoctor(doctor, hospitalId);
        return ResponseEntity.ok(createdDoctor);
    }


}
