package com.example.QhalaHackathon.repository;

import com.example.QhalaHackathon.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface patient_repository extends JpaRepository<Patient, Long> {
    Optional<Patient> findByidentificationNumber(String identificationNumber);
}
