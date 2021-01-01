package com.example.demo;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class Member {
    public Member(int yearDob, int monthDob, int dayDob){
        dob = new GregorianCalendar(yearDob, monthDob, dayDob);
        dob.set(yearDob, monthDob, dayDob);
        joiningDATE = new Date();
        expireDate = new GregorianCalendar();
        expireDate.add(Calendar.MONTH, 1);
        for(int i =0; i < 20; i++) {
            memberPaymentHistory[i] = new Payment(5, 5, 5);
        }
    }
    public Member(){
        joiningDATE = new Date();
        expireDate = new GregorianCalendar();
        expireDate.add(Calendar.MONTH, 1);
        for(int i =0; i < 20; i++) {
            memberPaymentHistory[i] = new Payment(5, 5, 5);
        }
    }
    public void setFullName(String fn, String ln1, String ln2){
        firstName = fn;
        lastName1 = ln1;
        lastName2 = ln2;
        fullName =  fn + " " + ln1 + " " + ln2;
    }
    public void setFullName(){
        fullName =  "Default Member Name";
    }
    public String getFullName(){
        return fullName;
    }
    /*public ArrayList viewMember(){
        return
    }*/
    public void setGymId() {
        GymId = nextId; // set id to next available id
        nextId++;
    }
    public int getGymId(){
        return GymId;
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
    public void pay(int amount){
        int dueAmount = 500;
        balance = amount - dueAmount;
        memberPaymentHistory[paymentObjectCreationCounter] = new Payment(amount, dueAmount, transaccionID );
        memberPaymentHistory[paymentObjectCreationCounter].setInstanciaDelPago();
        lastPayment = memberPaymentHistory[paymentObjectCreationCounter].getPaymentDate();
        expireDate.add(Calendar.MONTH, 1);
        //todo return balance after payment, wont be a void method then?
        if (balance >= 0){
            memberStatus = "Ok";
        }
        else {
            memberStatus = "There is an outstanding balance.";
        }
        paymentObjectCreationCounter++;
        transaccionID++;
    }
    public Payment[] getMemberPaymentHistory(int index){
        return memberPaymentHistory;            //TODO borrar uno de los 2 metodos
    }

    public Payment getMemberPaymentHistory(){
        for(int i =0; i<4; i++) {
            System.out.println("payment made " + memberPaymentHistory[i].paymentDate +
                    " Transaction ID:  " + paymentObjectCreationCounter +" instancia: "
                    + memberPaymentHistory[i].getTransaccionID());
        }
        return paymentHistory;
    }
    public Date getLastPayment(){

        return lastPayment;
    }
    public String checkMemberStatus(){
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
    }
    public String getMemberStatus() {
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
    public GregorianCalendar getDob(){
        return dob;
    }
    public void setDob(int day, int month, int year){
        dob.set( day, month, year);
        System.out.println("Update Successful");
    }

    private String fullName;
    private String firstName;
    private String lastName1;
    private String lastName2;
    private GregorianCalendar dob = new GregorianCalendar(1970, 0, 1);

    private int GymId;
    private static int nextId = 0;

    private String memberStatus = "please verify...";

    private GregorianCalendar joiningDate;
    private GregorianCalendar expireDate;
    private GregorianCalendar memberAttendance = new GregorianCalendar();
    private Date joiningDATE;//Joining date

    private Payment paymentHistory; //solo esta en uno de los constructor
    Payment[] memberPaymentHistory = new Payment[20]; //hmmm
    private static int transaccionID = 1;
    private int nextTransaccionID = 1;
    private Date lastPayment;
    private int paymentObjectCreationCounter = 0;
    int balance = 0;

}
