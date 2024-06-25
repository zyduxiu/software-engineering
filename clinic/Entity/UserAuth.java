package com.clinicappoint.clinic.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="logintable")
@Data
public class UserAuth {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;
    private String title;
    private String email;
}
