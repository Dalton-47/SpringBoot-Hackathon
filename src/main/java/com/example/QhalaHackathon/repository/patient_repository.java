package com.example.QhalaHackathon.repository;

import com.example.QhalaHackathon.entity.patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface patient_repository extends JpaRepository<patient, Long> {
    Optional<patient> findByidentificationNumber(String identificationNumber);
}
