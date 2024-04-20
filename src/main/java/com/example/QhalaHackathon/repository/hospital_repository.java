package com.example.QhalaHackathon.repository;

import com.example.QhalaHackathon.entity.hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface hospital_repository extends JpaRepository<hospital, Long> {

}

