package com.clinicappoint.clinic.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="doctortable")
@Data
public class DoctorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int doctorid;
    private String fullname;
    private String Specialization;
    private String birthDate;
    private String gender;
    private String homeAddress;
    private String phoneNumber;
    private String emailAddress;
    private String medicalNumberLicense;
    private String boardCertifications;
    private String medicalSchool;
    private String cuurentPosition;
    private String practiceYears;
    private Date RegistrationDate;
    private String department;
    private String onLeave;
    private String basicSalary;
    private String image;
    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Offdate> offdateList;
}
