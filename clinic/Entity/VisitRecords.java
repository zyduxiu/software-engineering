package com.clinicappoint.clinic.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.context.annotation.EnableMBeanExport;

@Entity
@Table(name = "visitRecords")
@Data
public class VisitRecords {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int record_id;

    @Column(nullable = false)
    private java.sql.Date visit_date;

    @Column(nullable = false)
    private String doctor_name;

    @Column(nullable = false)
    private String visit_reason;

    private String diagnosis;
    private String treatment;
    private int memberKey;
}
