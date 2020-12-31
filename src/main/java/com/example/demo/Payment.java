package com.example.demo;
import java.util.Date;
import java.util.GregorianCalendar;
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
    int transaccionID = 0;
    private static int nextTransactionID = 1;
    int nextTransaccionID = 1;
    int instanciaDelPago = 0;
    private int nextInstanciaDelPago = 1;
    int balance = 0;
    //Payment[] a = new Payment[nextTransaccionID + 1];
    String[] paymentInfo = new String[4];
    Date paymentDate;
    GregorianCalendar calendar1 = new GregorianCalendar();

    public void setAmount(int amount) {
        this.amount = amount;
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
    public int setInstanciaDelPago(){
        instanciaDelPago = nextInstanciaDelPago;
        nextInstanciaDelPago++;
        return instanciaDelPago;
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
