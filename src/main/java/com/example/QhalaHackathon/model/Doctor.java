package com.example.QhalaHackathon.model;


import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "doctors")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long doctorID;

    @Column(name = "name")
    private String doctorName;

    @Column(name = "specialty")
    private String doctorSpecialty;

    @Column(name = "email", unique = true)
    private String doctorEmail;

    @Column(name = "phoneNumber")
    private String doctorPhoneNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "hospital_id", nullable = false)  // Foreign key column
    private Hospital hospital;


}
