package com.example.demo.Member;

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

    public String getMemberJoiningDate(){
        return memberJoiningDate;
    }

    public void setMemberJoiningDate(String memberJoiningDate){ //Todo metodo obsoleto porque?
        this.memberJoiningDate = memberJoiningDate;
    }

    public String getMemberExpireDate() {
        return memberExpireDate;
    }

    public void setExpireDate(String memberExpireDate) {
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
        memberExpireDate = modifiedDate.toString();
    }





    public void setJoiningDate(String memberJoiningDate) {
    }
    public void setJoiningDate(){
        memberJoiningDate = joiningDate1.toString();
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
    private String memberJoiningDate;
    private String memberExpireDate;



    private String memberStatus = "please verify...";
    private Date joiningDATE;//Joining date
    private static int transaccionID = 1;
    private int nextTransaccionID = 1;

    private Date lastPayment;
    private int id;


    // todo add phone number, email, address
    //  considering that sql table needs to be modified


}
