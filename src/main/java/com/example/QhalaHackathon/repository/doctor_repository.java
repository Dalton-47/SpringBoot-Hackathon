package com.example.QhalaHackathon.repository;

import com.example.QhalaHackathon.entity.doctor;
import com.example.QhalaHackathon.entity.hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface doctor_repository extends JpaRepository<doctor, Long> {


}
