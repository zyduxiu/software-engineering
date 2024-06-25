package com.clinicappoint.clinic.Controller;

import com.clinicappoint.clinic.Entity.Appointment;
import com.clinicappoint.clinic.Entity.DoctorEntity;
import com.clinicappoint.clinic.Service.AppointmentTableService;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToOne;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin
@Controller
public class postScheduleController {
@Autowired
AppointmentTableService appointmentTableService;

    @CrossOrigin
    @PostMapping("/postschedule")
    public ResponseEntity<String> changeProfile(@RequestBody handleschedule pd) {
        System.out.println("Received schedule: " + pd.getDate());
        String Date=pd.getDate();
        int hourindex=pd.getHourindex();
        int minuteindex=pd.getMinuteIndex();
       String attribute=pd.getAttribute();
        String doctorName=pd.getDoctorName();
        String type=pd.getType();
        String phonenumber=pd.getPhonenumber();
        String name=pd.getName();
        String membership=pd.getMembership();
        String appointmentStartTime=pd.getAppointmentStartTime();
        int appointmentStartHourindex=pd.getAppointmentStartHourindex();
        int appointmentStartMinutesindex=pd.getAppointmentStartMinutesindex();
        int appointmentEndHourindex=pd.getAppointmentEndHourindex();
        int appointmentEndMinutesindex=pd.getAppointmentEndMinutesindex();
        String appointmentEndTime=pd.getAppointmentEndTime();
        int appointmentcost=pd.getAppointmentcost();
        appointmentTableService.postAppointment(Date,doctorName,hourindex,minuteindex,attribute,
                type,phonenumber,name,membership,appointmentStartTime,
                appointmentStartHourindex,appointmentStartMinutesindex,appointmentEndHourindex
        ,appointmentEndMinutesindex,appointmentEndTime,appointmentcost);
        return ResponseEntity.ok("Data received successfully!");
    }

    @CrossOrigin
    @PostMapping("/deleteschedule")
    public ResponseEntity<String> deleteSchedule(@RequestBody handleschedule pd) {
        String Date=pd.getDate();
        int hourindex=pd.getHourindex();
        int minuteindex=pd.getMinuteIndex();
        String doctorName=pd.getDoctorName();
        appointmentTableService.deleteAppointment(Date,doctorName,hourindex,minuteindex);
        return ResponseEntity.ok("Data received successfully!");
    }
    @Data
    static class handleschedule{
        private int minuteIndex;
        private String name;
        private String phonenumber;
        private String type;
        private String membership;
        private String appointmentStartTime;
        private int appointmentStartHourindex;
        private int appointmentStartMinutesindex;
        private int appointmentEndHourindex;
        private int appointmentEndMinutesindex;
        private String appointmentEndTime;
        private String attribute;
        private int appointmentcost;
        private String doctorName;
        private int hourindex;
        private String date;
    }
}

