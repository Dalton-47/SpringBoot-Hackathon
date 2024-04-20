package com.example.QhalaHackathon.repository;

import com.example.QhalaHackathon.entity.patient;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface patient_repository extends JpaRepository<patient, Long> {

}
