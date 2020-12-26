package com.example.demo;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class Member {
    public Member(){ } //default constructor
    public Member(String p, String fn, String ln1, String ln2,
                  int Id, GregorianCalendar jd, Date ed, String ms,
                  Payment ph, int year, int month, int day){
        photo = p;
        firstName = fn;
        lastName1 = ln1;
        lastName2 = ln2;
        GymId = Id;
        joiningDate = jd;
        expireDate = ed;
        memberStatus = ms;
        paymentHistory = ph;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
    }


    public void setFullName(String fn, String ln1, String ln2){
        firstName = fn;
        lastName1 = ln1;
        lastName2 = ln2;
        fullName =  fn + " " + ln1 + " " + ln2;
    }
    public String getFullName(){
        return fullName;
    }
    /*public ArrayList viewMember(){
        return
    }*/
    public void setGymId()
    {
        GymId = nextId; // set id to next available id
        nextId++;
    }
    public int getGymId(){
        return GymId;
    }
    public void setJoiningDate(int year, int month, int day) {
        joiningDate = new GregorianCalendar (year, month-1, day);
        hireday = joiningDate.getTime();
    }
    public Date getJoiningDate() {
        return hireday;
    }

    public void pay(int amount){
        int dueAmount = 500;
        int balance = amount - dueAmount;
        memberPaymentHistory[transaccionID-1] = new Payment(amount, dueAmount, transaccionID );
        if (balance >= 0){
            memberStatus = "Ok";
        }
        else {
            memberStatus = "please make payment";
        }
        transaccionID++;
    }

    public String getMemberStatus() {
        return memberStatus;
    }
    public static int getTransaccionID(){
        return transaccionID;
    }

    private String photo;
    private String fullName;
    private String firstName;
    private String lastName1;
    private String lastName2;
    private int GymId;
    private static int nextId = 1;
    private GregorianCalendar joiningDate;
    private Date expireDate;
    private String memberStatus = "please verify...";
    private Payment paymentHistory;
    private GregorianCalendar memberAttendance = new GregorianCalendar();
    private Date hireday;//Joining date
    private Payment[] memberPaymentHistory = new Payment[20];
    private static int transaccionID = 1;
    private int nextTransaccionID = 1;
    private Date lastPayment;
}
