package com.example.QhalaHackathon.repository;

import com.example.QhalaHackathon.entity.hospital;
import com.example.QhalaHackathon.entity.medical_history;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface medical_repository extends JpaRepository<medical_history, Long> {

}
