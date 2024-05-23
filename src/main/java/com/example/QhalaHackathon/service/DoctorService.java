package com.example.QhalaHackathon.service;

import com.example.QhalaHackathon.dto.DoctorHospitalDTO;

import com.example.QhalaHackathon.model.Doctor;
import com.example.QhalaHackathon.model.Hospital;
import com.example.QhalaHackathon.repository.doctor_repository;
import com.example.QhalaHackathon.repository.hospital_repository;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@NoArgsConstructor
@Service
public class DoctorService {


    private doctor_repository doctorRepository;

    private hospital_repository hospitalRepository;

    @Autowired
    private DoctorService (@Qualifier("doctor_repository") doctor_repository doctorRepository, @Qualifier("hospital_repository") hospital_repository hospitalRepository)
      {
          this.hospitalRepository =hospitalRepository;
          this.doctorRepository = doctorRepository;
      }

    public Doctor createDoctor(Doctor doctor, Long hospitalId) {
        Hospital hospital = hospitalRepository.findById(hospitalId)
                .orElseThrow(() -> new RuntimeException("Hospital not found"));
        doctor.setHospital(hospital);
        return doctorRepository.save(doctor);
    }

    public List<DoctorHospitalDTO> getAllDoctorsHospital()
      {
          return doctorRepository.findAll()
                  .stream()
                  .map(this::convertEntityToDTO)
                  .toList();

      }

      public DoctorHospitalDTO convertEntityToDTO (Doctor doctor)
      {
        DoctorHospitalDTO doctorHospitalDTO = new DoctorHospitalDTO();

          doctorHospitalDTO.setDoctorID(doctor.getDoctorID());
          doctorHospitalDTO.setDoctorName(doctor.getDoctorName());
          doctorHospitalDTO.setDoctorEmail((doctor.getDoctorEmail()));
          doctorHospitalDTO.setDoctorSpecialty(doctor.getDoctorSpecialty());
          doctorHospitalDTO.setHospitalName(doctor.getHospital().getHospitalName());
          doctorHospitalDTO.setHospitalLocation(doctor.getHospital().getHospitalLocation());

             return doctorHospitalDTO;
      }




}
