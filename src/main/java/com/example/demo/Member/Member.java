package com.example.demo.Member;
import com.example.demo.Payment.Payment;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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

    public String getMemberId(){
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
        /*
        memberId = nextId; // set id to next available id
        nextId++;
        //todo String parse to int e viceversa
    */
    }

    public void setJoiningDate(int year, int month, int day) {
        joiningDate = new GregorianCalendar (year, month-1, day);
        joiningDate.set(year, month-1, day);
        joiningDATE = joiningDate.getTime();
        expireDate = new GregorianCalendar(year, month, day);
        expireDate.add(Calendar.MONTH, 1);
    }
    public Date getJoiningDate(){
        return joiningDATE;
    }
    public GregorianCalendar getExpireDate(){
        return expireDate;
    }

   /* public void pay(int amount){
        Payment[] temp = new Payment[memberPaymentHistory.length+1];
        for(int i = 0; i< temp.length-1; i++){
            temp[i] = memberPaymentHistory[i];
        }
        memberPaymentHistory = new Payment[temp.length];
        int dueAmount = 500;
        for(int i = 0; i<temp.length; i++){
         memberPaymentHistory[i] = temp[i];
        }
        balance = amount - dueAmount;
        memberPaymentHistory[z] = new Payment(amount);

        memberPaymentHistory[z].setInstanciaDelPago();
        lastPayment = memberPaymentHistory[z].paymentDate;
        expireDate.add(Calendar.MONTH, 1);
        //todo return balance after payment, wont be a void method then?
        if (balance >= 0){
            memberStatus = "Ok";
        }
        else {
            memberStatus = "There is an outstanding balance.";
        }
        z++;
        transaccionID++;
    } */

    /* public String checkMemberStatus(){
        GregorianCalendar currentDay = new GregorianCalendar();
        if ( currentDay.after(expireDate )){ //test method
            System.out.println("membership Expired");
        } //and deny access
        if (currentDay.equals(expireDate)){
            System.out.println("Last Day to renew membership");
        }
        if(currentDay.before(expireDate)){
            System.out.println("Membership up to Date");
        }
        return memberStatus;
    }*/

    /*public String getMemberStatus() {
        if( memberStatus.equals("ok") ){
            System.out.println("Member's balance is up to date");
        }
        else System.out.println(" ");
        return memberStatus;
    }
    public static int getTransaccionID(){
        return transaccionID;
    }

    public int getBalance() {
        return balance;
    }

    /*
    public GregorianCalendar getDob(){
        return dob;
    }

    public void setDob(int day, int month, int year){
        dob.set( day, month, year);
        System.out.println("Update Successful");
    } */

    private String memberName;
    private String memberPhoneNumber;
    private String memberDateOfBirth;
    private String fullName;

    //
    // private GregorianCalendar dob = new GregorianCalendar(1970, 0, 1);

    private String memberId;
    private static int nextId = 0;

    private String memberStatus = "please verify...";

    private GregorianCalendar joiningDate;
    private GregorianCalendar expireDate;
    private GregorianCalendar memberAttendance = new GregorianCalendar();
    private Date joiningDATE;//Joining date

    private Payment paymentHistory; //solo esta en uno de los constructor
    Payment[] memberPaymentHistory;//hmmm
    int z = 0;
    private static int transaccionID = 1;
    private int nextTransaccionID = 1;
    private Date lastPayment;
    private int pOCC  = 1; //todo pOCC = paymentObjectCreationCounter
    //int balance = 0;


    // todo add phone number, email, address
    //  considering that sql table needs to be modified




}
