package com.example.demo;

import java.util.Date;

public class Payment {

    public Payment(int anAmount, int aDueAmount, int aTransaccionId){
    amount = anAmount;
    dueAmount = aDueAmount;
    transaccionID = aTransaccionId;
    }

    int amount;
    int PaidAmount;
    int dueAmount;
    Date lastPayment;
    int transaccionID;
    int nextTransaccionID;
    Payment[] a = new Payment[nextTransaccionID + 1];

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public double getAmount(){
        return amount;
    }

    /*public void memberPay(Member x, double anAmount){
        int alfa = transaccionID;
        Payment[alfa] = new Payment();
        nextTransaccionID++
    }*/


}
