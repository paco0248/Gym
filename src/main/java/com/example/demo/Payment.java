package com.example.demo;
import java.util.Date;
import java.util.GregorianCalendar;
public class Payment {
    public Payment(int anAmount){
    amount = anAmount;
    transaccionID = 0;
    paymentDate = new Date();
    memberName = "deault";
    balance = 0;
    }
    private String memberName;
    int amount;
    int PaidAmount;
    int dueAmount = 0;
    Date lastPayment;
    private int transaccionID;
    private static int nextTransactionID = 1;
    private int nextTransaccionID = 1;
    private int instanciaDelPago = 0;
    private int nextInstanciaDelPago = 1;
    private int balance;

    String[] paymentInfo = new String[4];
    Date paymentDate;
    GregorianCalendar calendar1 = new GregorianCalendar();

    public void setMemberName(String name){
        memberName = name;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public double getAmount() {
        return amount;
    }
    /*public void memberPay(Member x, double anAmount){
        int alfa = transaccionID;
        Payment[alfa] = new Payment();
        nextTransaccionID++
    }*/
    /*public int[] viewPaymentInfo(){
        return
    }*/
   public void setPaymentDate(){
        paymentDate = new Date();
    }
    public Date getPaymentDate() {
        return paymentDate;
    }
    public void setInstanciaDelPago(){  //TOdo uni dos metodos, make it return both vaules
        instanciaDelPago = nextInstanciaDelPago;
        nextInstanciaDelPago = nextInstanciaDelPago++;
        transaccionID = nextTransactionID;
        nextTransactionID++;
    }
    public int getInstanciaDelPago(){
        return instanciaDelPago;
    }
    public void setTransaccionID(){
        transaccionID = nextTransactionID;
        nextTransactionID++;
    }
    public int getTransaccionID(){
        return transaccionID;
    }
}
