package com.clinicappoint.clinic.Service;

import com.clinicappoint.clinic.Entity.DoctorEntity;

import java.util.Date;
import java.util.List;

public interface DoctorService {
    public List<DoctorEntity> getallDoctors();

    public void alterDoctor(
            String fullname,
            String specialization,
            String birthDate,
            String gender,
            String homeAddress,
            String phoneNumber,
            String emailAddress,
            String medicalNumberLicense,
            String boardCertifications,
            String medicalSchool,
            String currentPosition,
            String practiceYears,
            Date registrationDate,
            String department,
            String onLeave,
            String basicSalary
    ) ;

    }
