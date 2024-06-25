package com.clinicappoint.clinic.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "membercard")
@Data
public class MemberCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer cardid;

    private int cardBalance;

    private String cardDiscount;

    private int cardNumber;

    private String cardName;

    private int memberKey;

    @ManyToOne
    @JoinColumn( referencedColumnName = "memberKey", insertable = false, updatable = false)
    private MemberList member;

}