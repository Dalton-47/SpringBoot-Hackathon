package com.example.QhalaHackathon.dto;

import lombok.Data;

@Data
public class DoctorHospitalDTO {
    private Long doctorID;
    private String doctorName;
    private String doctorSpecialty;
    private String doctorEmail;
    private String hospitalName;
    private String hospitalLocation;

}
