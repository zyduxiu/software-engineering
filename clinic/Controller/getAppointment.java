package com.clinicappoint.clinic.Controller;

import com.clinicappoint.clinic.Entity.Appointment;
import com.clinicappoint.clinic.Repository.AppointmentRepository;
import com.clinicappoint.clinic.Service.AppointmentTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class getAppointment {
    @Autowired
    AppointmentTableService appointmentTableService;
    @Autowired
    AppointmentRepository appointmentRepository;

    @CrossOrigin
    @GetMapping("/getAppointDate")
    public List<Appointment> getAppointmentDate(String date){
        return appointmentTableService.getAppointmentTableByDate(date);
    }

    // 统计未付款客户
    @CrossOrigin
    @GetMapping("/unpaid")
    public List<Appointment> getUnpaidAppointments() {
        List<Appointment> unpaid = appointmentRepository.findByAttribute("已诊");
        System.out.println("Query Result: " + unpaid);  // 打印查询结果
        if (unpaid.isEmpty()) {
            System.out.println("No unpaid appointments found.");
        } else {
            System.out.println("Unpaid appointments found: " + unpaid.size());
        }
        return unpaid;
    }

//    @GetMapping("/unpaid")
//    public List<Appointment> getUnpaidAppointments() {
//        List<Appointment> testAppointments = new ArrayList<>();
//        testAppointments.add(new Appointment(1, "Test Name", "1234567890", "Test Type", "Test Membership", "09:00", 9, 0, 10, 0, "10:00", "已诊", 100, "Test Doctor", 9, 0, "2024/06/19"));
//        System.out.println("Returning test data: " + testAppointments);
//        return testAppointments;
//    }
}
