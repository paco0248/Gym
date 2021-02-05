package com.example.demo.Payment;
import java.util.Date;
import java.util.GregorianCalendar;

public class Payment {
  private String paymentId;
  private String paymentDate;
  private String amount;
  private String memberId;

  public String getPaymentId(){
    return paymentId;
  }
  public void setPaymentId(String paymentId){
    this.paymentId = paymentId;
  }

  public String getPaymentDate(){
    return paymentDate;
  }
  public void setPaymentDate(String paymentDate){
    this.paymentDate = paymentDate;
  }

  public String getAmount(){
    return amount;
  }
  public void setAmount(String amount){
    this.amount = amount;
  }

  public String getMemberId(){
    return memberId;
  }
  public void setMemberId(String memberId){
    this.memberId = memberId;
  }


}
