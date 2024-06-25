package com.clinicappoint.clinic.Repository;

import com.clinicappoint.clinic.Entity.VisitRecords;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitRecordsRepository extends JpaRepository<VisitRecords, Integer> {
}
