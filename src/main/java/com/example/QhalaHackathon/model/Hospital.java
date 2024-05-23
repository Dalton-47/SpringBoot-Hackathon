package com.example.QhalaHackathon.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "hospitals")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hospital_id", nullable = false)
    private Long hospitalId;

    @Column(name = "hospital_name", nullable = false)
    private String hospitalName;

    @Column(name = "location")
    private String hospitalLocation;


    @Column(name = "contact_number")
    private String hospitalContactNumber;

    @Column(name = "description") // Adjust the length as per your requirement
    private String hospitalDescription;



}
