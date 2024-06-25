package com.clinicappoint.clinic.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name="offdate")
@Data
public class Offdate {
    @Id
    private int Offdatekey;
    private String offdate;
    @ManyToOne
    @JsonIgnore
    @ToString.Exclude
    private DoctorEntity doctor;
}
