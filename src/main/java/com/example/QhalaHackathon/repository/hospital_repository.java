package com.example.QhalaHackathon.repository;

import com.example.QhalaHackathon.model.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface hospital_repository extends JpaRepository<Hospital, Long> {

}

