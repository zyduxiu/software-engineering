package com.clinicappoint.clinic.Entity;

public class MemberDto {
    private String memberName;
    private int memberAge;
    private String memberGender;
    private String memberAddress;
    private String memberPhone;
    private String memberEmail;
    private int cashIn;

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
    public String getMemberPhone() {
        return memberPhone;
    }
    public void setMemberPhone(String memberPhone) {
        this.memberPhone = memberPhone;
    }
    public String getMemberEmail() {
        return memberEmail;
    }
    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }
    public int getCashIn() {
        return cashIn;
    }
    public void setCashIn(int cashIn) {
        this.cashIn = cashIn;
    }


}
