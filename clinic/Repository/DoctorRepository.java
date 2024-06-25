package com.clinicappoint.clinic.Repository;

import com.clinicappoint.clinic.Entity.DoctorEntity;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DoctorRepository extends JpaRepository<DoctorEntity,Integer> {
    @Query("SELECT b from DoctorEntity b WHERE b.fullname=:fullname")
    public DoctorEntity getDoctorEntityByName(@Param("fullname") String fullname);

    @Query("select b from DoctorEntity b")
    public List<DoctorEntity> getAll();
}
