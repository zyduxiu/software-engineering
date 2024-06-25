package com.clinicappoint.clinic.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "appointment")
@Data
public class Appointment {
    @Id
    private int appointmentkey;
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
    private String doctor;
    private int hourindex;
    private int minuteindex;
    private String date;


    // 无参数构造函数
    public Appointment() {
    }

    // 添加带参数的构造函数
    public Appointment(int appointmentkey, String name, String phonenumber, String type, String membership,
                       String appointmentStartTime, int appointmentStartHourindex, int appointmentStartMinutesindex,
                       int appointmentEndHourindex, int appointmentEndMinutesindex, String appointmentEndTime,
                       String attribute, int appointmentcost, String doctor, int hourindex, int minuteindex, String date) {
        this.appointmentkey = appointmentkey;
        this.name = name;
        this.phonenumber = phonenumber;
        this.type = type;
        this.membership = membership;
        this.appointmentStartTime = appointmentStartTime;
        this.appointmentStartHourindex = appointmentStartHourindex;
        this.appointmentStartMinutesindex = appointmentStartMinutesindex;
        this.appointmentEndHourindex = appointmentEndHourindex;
        this.appointmentEndMinutesindex = appointmentEndMinutesindex;
        this.appointmentEndTime = appointmentEndTime;
        this.attribute = attribute;
        this.appointmentcost = appointmentcost;
        this.doctor = doctor;
        this.hourindex = hourindex;
        this.minuteindex = minuteindex;
        this.date = date;
    }
}
