package com.clinicappoint.clinic.ServiceImp;

import com.clinicappoint.clinic.Entity.DoctorEntity;
import com.clinicappoint.clinic.Repository.DoctorRepository;
import com.clinicappoint.clinic.Service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public class DoctorServiceImp implements DoctorService {
    @Autowired
    DoctorRepository doctorRepository;
    public List<DoctorEntity> getallDoctors(){
        return doctorRepository.getAll();
    }

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
    ){
        DoctorEntity doctorEntity=new DoctorEntity();
        if(doctorRepository.getDoctorEntityByName(fullname)!=null){
            doctorEntity=doctorRepository.getDoctorEntityByName(fullname);
        }
        else{
            doctorEntity.setFullname(fullname);
        }
        Date date=new Date();
        doctorEntity.setRegistrationDate(date);
        doctorEntity.setSpecialization(specialization);
        doctorEntity.setBirthDate(birthDate);
        doctorEntity.setGender(gender);
        doctorEntity.setHomeAddress(homeAddress);
        doctorEntity.setPhoneNumber(phoneNumber);
        doctorEntity.setEmailAddress(emailAddress);
        doctorEntity.setMedicalNumberLicense(medicalNumberLicense);
        doctorEntity.setBoardCertifications(boardCertifications);
        doctorEntity.setMedicalSchool(medicalSchool);
        doctorEntity.setCuurentPosition(currentPosition);
        doctorEntity.setPracticeYears(practiceYears);
        doctorEntity.setRegistrationDate(registrationDate);
        doctorEntity.setDepartment(department);
        doctorEntity.setOnLeave(onLeave);
        doctorEntity.setBasicSalary(basicSalary);
        doctorRepository.save(doctorEntity);
    }
}
