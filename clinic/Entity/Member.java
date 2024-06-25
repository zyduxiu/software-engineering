package com.clinicappoint.clinic.Entity;

import jakarta.persistence.*;


@Entity
@Table(name = "memberList")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer memberKey;
    private String memberName;
    private int memberAge;
    private String memberGender;
    private String memberAddress;
    private String memberEmail;
    private String memberPhone;
    private int cashIn;

    // getters and setters
    public Member() {

    }

    public Member(String memberName, int memberAge, String memberGender, String memberAddress, String memberEmail, String memberPhone, int cashIn){
        this.memberName = memberName;
        this.memberAge = memberAge;
        this.memberGender = memberGender;
        this.memberAddress = memberAddress;
        this.memberEmail = memberEmail;
        this.memberPhone = memberPhone;
        this.cashIn = cashIn;
    }

    public Integer getMemberKey() {
        return memberKey;
    }

    public void setMemberKey(Integer memberKey) {
        this.memberKey = memberKey;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public int getMemberAge() {
        return memberAge;
    }

    public void setMemberAge(int memberAge) {
        this.memberAge = memberAge;
    }

    public String getMemberGender() {
        return memberGender;
    }

    public void setMemberGender(String memberGender) {
        this.memberGender = memberGender;
    }

    public String getMemberAddress() {
        return memberAddress;
    }

    public void setMemberAddress(String memberAddress) {
        this.memberAddress = memberAddress;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getMemberPhone() {
        return memberPhone;
    }

    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone;
    }
    public int getCashIn() {
        return cashIn;
    }
    public void setCashIn(int cashIn) {
        this.cashIn = cashIn;
    }
}
