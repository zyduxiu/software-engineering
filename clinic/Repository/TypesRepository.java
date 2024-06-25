package com.clinicappoint.clinic.Repository;

import com.clinicappoint.clinic.Entity.Appointment;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import com.clinicappoint.clinic.Entity.types;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TypesRepository extends JpaRepository<types,Integer> {
    @Query("select b from types b WHERE b.typename=:typename")
    types findTypesByTypename(@Param("typename") String typename);
}
