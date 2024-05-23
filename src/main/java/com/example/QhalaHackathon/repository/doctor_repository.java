package com.example.QhalaHackathon.repository;

import com.example.QhalaHackathon.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface doctor_repository extends JpaRepository<Doctor, Long> {


}
