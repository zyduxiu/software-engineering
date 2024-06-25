package com.clinicappoint.clinic.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="typetable")
@Data
public class types {
    @Id
    private int id;
    private String code;
    private String typename;
    private int timecost;
    private int cost;
    private int commission;
}
