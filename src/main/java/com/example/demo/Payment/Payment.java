package com.example.demo.Payment;
import java.util.Calendar;
import java.util.Date;

public class Payment {

  public Payment(){
  setExtendedExpiredDate();
  setPaymentDateDate();
  }
  private String paymentId;
  private String paymentDate;
  private Date paymentDateDate;
  private String amount;
  private String memberId;
  private String memberExpireDate;
  private int id;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getPaymentId(){ return paymentId;
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

  public String getMemberExpireDate(){ return memberExpireDate; }

  public void setExtendedExpiredDate() {
    Date now = new Date();
    Calendar cal = Calendar.getInstance();
    cal.setTime(now);
    // manipulate date
    cal.add(Calendar.MONTH, 1);
    // convert calendar to date
    Date modifiedDate = cal.getTime();
    memberExpireDate = modifiedDate.toString();
  }

  public Date getPaymentDateDate() {
    return paymentDateDate;
  }

  public void setPaymentDateDate(Date paymentDateDate) {
    this.paymentDateDate = new Date();

  }
  public void setPaymentDateDate() {
    this.paymentDateDate = new Date();
    Calendar cal = Calendar.getInstance();
    cal.setTime(paymentDateDate);
    cal.add(Calendar.MONTH, 1);
    Date modifiedDate = cal.getTime();
    paymentDateDate = modifiedDate;
  }
}
