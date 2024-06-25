package com.clinicappoint.clinic.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.List;

@Entity
@Table
@Data
public class MemberList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int memberKey;

    private String memberAddress;

    private int memberAge;

    private String memberEmail;

    private String memberGender;

    private String memberName;

    private String memberPhone;

    private int cashIn;
    @OneToMany(mappedBy = "member",cascade = CascadeType.ALL,orphanRemoval = true)
    @ToString.Exclude
    private List<MemberCard> cards;
}
