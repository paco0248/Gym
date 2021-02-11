package com.example.demo.Entity;

import java.util.*;


public class Member {

    public Member(){

    }

    public String getMemberName(){
        return memberName;
    }

    public void setMemberName (String memberName){
        this.memberName = memberName;
    }

    public String getMemberPhoneNumber(){
        return memberPhoneNumber;
    }

    public void setMemberPhoneNumber (String memberPhoneNumber){
        this.memberPhoneNumber = memberPhoneNumber;
    }

    public String getMemberDateOfBirth(){
        return memberDateOfBirth;
    }

    public void setMemberDateOfBirth (String memberDateOfBirth){
        this.memberDateOfBirth = memberDateOfBirth;
    }

    public String getMemberId(String memberId){
        return memberId;
    }
    public String getMemberId(){
        return memberId;
    }
    public void setMemberId(String memberId) {
        this.memberId = memberId;
        //UUID.randomUUID().toString();
   //todo automate gym id
    }

    public void setMemberId(List<Member> memberList) {
        this.memberId = memberId;
        //UUID.randomUUID().toString();
        //todo automate gym id
    }

    public Date getMemberJoiningDate(){
        return memberJoiningDate;
    }

    public void setMemberJoiningDate(Date memberJoiningDate){ //Todo metodo obsoleto porque?
        this.memberJoiningDate = memberJoiningDate;
    }

    public Date getMemberExpireDate() {
        return memberExpireDate;
    }
    public Date getExtendedExpireDate(){
        return extendedExpireDate;
    }
    public void extendExpireDate(){
        extendedExpireDate = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(extendedExpireDate);
        // manipulate date
        cal.add(Calendar.MONTH, 1);
        // convert calendar to date
        Date modifiedDate = cal.getTime();
        extendedExpireDate = modifiedDate;
    }
    public void setExtendedExpireDate(Date extendedExpireDate){
        this.extendedExpireDate = extendedExpireDate;
    }

    public void setExpireDate(Date memberExpireDate) {
        this.memberExpireDate = memberExpireDate;
    }
    public void setExpireDate() {
       // this.memberExpireDate = getJoiningdate1.;
        Calendar cal = Calendar.getInstance();
        cal.setTime(joiningDate1);
        // manipulate date
        cal.add(Calendar.MONTH, 1);
        // convert calendar to date
        Date modifiedDate = cal.getTime();
        memberExpireDate = modifiedDate;
    }





    public void setJoiningDate(Date memberJoiningDate) {
        this.memberJoiningDate = memberJoiningDate;
    }
    public void setJoiningDate(){
        memberJoiningDate = memberJoiningDate;
    }
    public int getId(){
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    private String memberName;
    private String memberPhoneNumber;
    private String memberDateOfBirth;
    private String memberId;
    private Date joiningDate1 = new Date();
    private Date memberJoiningDate = new Date();
    private Date memberExpireDate;
    private Date extendedExpireDate;



    private String memberStatus = "please verify...";
    private Date joiningDATE;//Joining date
    private static int transaccionID = 1;
    private int nextTransaccionID = 1;

    private Date lastPayment;
    private int id;


    // todo add phone number, email, address
    //  considering that sql table needs to be modified


}
