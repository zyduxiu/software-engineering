package com.clinicappoint.clinic.ServiceImp;

import com.clinicappoint.clinic.Entity.Appointment;
import com.clinicappoint.clinic.Entity.DoctorEntity;
import com.clinicappoint.clinic.Repository.AppointmentRepository;
import com.clinicappoint.clinic.Repository.DoctorRepository;
import com.clinicappoint.clinic.Service.AppointmentTableService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AppointmentTableServiceImpl implements AppointmentTableService {
    @Autowired
    AppointmentRepository appointmentRepository;

    @Autowired
    DoctorRepository doctorRepository;
    @Override
    public List<Appointment> getAppointmentTableByDate(String date) {
        return appointmentRepository.findAppointmentByDate(date);
    }

    @Override
    @Transactional
    public void postAppointment(String date,String doctorName,int Hourindex,int Minuteindex,String attribute
            ,String type, String phonenumber,String name,String membership,String appointmentStartTime,int appointmentStartHourindex,
                                int appointmentStartMinutesindex,int appointmentEndHourindex,int appointmentEndMinutesindex,String appointmentEndTime,
                                int appointmentcost  ){
        Appointment appointment = new Appointment();
        //   DoctorEntity doctorEntity=doctorRepository.getDoctorEntityByName(doctorName);

            if (appointmentRepository.findAppointmentByIndex(date,doctorName,Hourindex,Minuteindex)!=null) {
                    appointment = appointmentRepository.findAppointmentByIndex(date, doctorName, Hourindex, Minuteindex);
                    appointment.setAttribute(attribute);
                    appointmentRepository.save(appointment);
            } else {
                appointment.setDate(date);
                appointment.setHourindex(Hourindex);
                appointment.setDoctor(doctorName);
                appointment.setMinuteindex(Minuteindex);
                appointment.setAttribute(attribute);
                appointment.setType(type);
                appointment.setPhonenumber(phonenumber);
                appointment.setName(name);
                appointment.setMembership(membership);
                appointment.setAppointmentStartTime(appointmentStartTime);
                appointment.setAppointmentStartHourindex(appointmentStartHourindex);
                appointment.setAppointmentStartMinutesindex(appointmentStartMinutesindex);
                appointment.setAppointmentEndHourindex(appointmentEndHourindex);
                appointment.setAppointmentEndMinutesindex(appointmentEndMinutesindex);
                appointment.setAppointmentEndTime(appointmentEndTime);
                appointment.setAppointmentcost(appointmentcost);
                appointmentRepository.save(appointment);
            }
//            return;
        }

        @Override
        public void deleteAppointment(String date,String doctorName,int Hourindex,int Minuteindex){
                Appointment appointment = new Appointment();
                appointment = appointmentRepository.findAppointmentByIndex(date, doctorName, Hourindex, Minuteindex);
                appointmentRepository.delete(appointment);

        }

}
