package com.clinicappoint.clinic.Repository;

import com.clinicappoint.clinic.Entity.Appointment;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment,Integer> {
    @Query("SELECT b from Appointment b WHERE b.date=:date and b.doctor=:doctor and b.hourindex=:hourindex and b.minuteindex=:minuteindex")
    Appointment findAppointmentByIndex(@Param("date") String date,@Param("doctor") String doctor,@Param("hourindex") int hourindex,@Param("minuteindex") int minuteindex);

    @Query("SELECT b from Appointment b WHERE b.date=:date and b.doctor=:doctor and b.hourindex=:hourindex and b.minuteindex=:minuteindex and b.attribute=:attribute")
    Appointment findAppointmentByAllIndex(@Param("date") String date,@Param("doctor") String doctor,@Param("hourindex") int hourindex,@Param("minuteindex") int minuteindex,@Param("attribute") String attribute);

    @Query("select b from Appointment b WHERE b.date=:data")
    List<Appointment> findAppointmentByDate(@Param("data") String data);

    List<Appointment> findByAttribute(String attribute);
}
