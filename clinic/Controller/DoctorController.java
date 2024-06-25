package com.clinicappoint.clinic.Controller;

import com.clinicappoint.clinic.Entity.DoctorEntity;
import com.clinicappoint.clinic.Service.DoctorService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@CrossOrigin
@RestController
public class DoctorController {
    @Autowired
    DoctorService doctorService;

    @CrossOrigin
    @GetMapping("/getDoctor")
    public List<DoctorEntity> getDoctors(){
        return  doctorService.getallDoctors();
    }

    @CrossOrigin
    @PostMapping("/updatedoctors")
    public ResponseEntity<String> updateDoctors(@RequestBody doctor pd){
        doctorService.alterDoctor(
                pd.getFullname(),
                pd.getSpecialization(),
                pd.getBirthDate(),
                pd.getGender(),
                pd.getHomeAddress(),
                pd.getPhoneNumber(),
                pd.getEmailAddress(),
                pd.getMedicalNumberLicense(),
                pd.getBoardCertifications(),
                pd.getMedicalSchool(),
                pd.getCuurentPosition(),
                pd.getPracticeYears(),
                pd.getRegistrationDate(),
                pd.getDepartment(),
                pd.getOnLeave(),
                pd.getBasicSalary()
        );
        return ResponseEntity.ok("yes");
    }

    @Data
    static class doctor{
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
    }
}
