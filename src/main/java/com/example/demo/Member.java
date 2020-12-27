package com.example.demo;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class Member {
    public Member(){ }//default constructor
    public Member(String p, String fn, String ln1, String ln2,
                  int Id, GregorianCalendar jd, GregorianCalendar ed, String ms,
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
        memberPaymentHistory[paymentObjectCreationCounter].setPaymentDate();
        memberPaymentHistory[paymentObjectCreationCounter].setInstanciaDelPago();
        memberPaymentHistory[paymentObjectCreationCounter].setTransaccionID();
        lastPayment = memberPaymentHistory[paymentObjectCreationCounter].getPaymentDate();
        expireDate.add(Calendar.MONTH, 1);
        //System.out.println(memberPaymentHistory[0].paymentDate.toString());
        if (balance >= 0){
            memberStatus = "Ok";
        }
        else {
            memberStatus = "There is an outstanding balance.";
        }
        paymentObjectCreationCounter++;
        transaccionID++;
    }
    public Payment getMemberPaymentHistory(){
        for(int i =0; i<4; i++) {
            System.out.println("payment made " + memberPaymentHistory[i].paymentDate +
                    " Transaction ID:  " + paymentObjectCreationCounter +" instancia: "+ memberPaymentHistory[i].getTransaccionID());
        }
        return paymentHistory;
    }

    public Date getLastPayment(){
        return lastPayment;
    }

    public String checkMemberStatus(){
        GregorianCalendar currentDay = new GregorianCalendar(2021,5,20);
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

    private String photo;
    private String fullName;
    private String firstName;
    private String lastName1;
    private String lastName2;

    private int GymId;
    private static int nextId = 1;

    private String memberStatus = "please verify...";


    private GregorianCalendar joiningDate;
    private GregorianCalendar expireDate;
    private GregorianCalendar memberAttendance = new GregorianCalendar();
    private Date joiningDATE;//Joining date

    private Payment paymentHistory; //solo esta en uno de los constructor
    private Payment[] memberPaymentHistory = new Payment[20]; //hmmm
    private static int transaccionID = 1;
    private int nextTransaccionID = 1;
    private Date lastPayment;
    private int paymentObjectCreationCounter = 0;
    int balance = 0;

}
