package com.example.QhalaHackathon.repository;

import com.example.QhalaHackathon.model.MedicalHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface medical_repository extends JpaRepository<MedicalHistory, Long> {

}
