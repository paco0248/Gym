package com.example.demo.Model;
import java.util.Calendar;
import java.util.Date;

public class Payment {

  public Payment() {

  }

  private int paymentId;
  private String returnString;
  private Date paymentDate = new Date();
  private float amount;
  private String memberId;

  public int getPaymentId() {
    return paymentId;
  }

  public void setPayme ntId(String paymentId) {
    this.paymentId = paymentId;
  }

  public Date getPaymentDate() {
    return paymentDate;
  }

  public void setPaymentDate(Date paymentDate) {
    this.paymentDate = paymentDate;
  }

  public float getAmount() {
    return amount;
  }

  public void setAmount(float amount) {
    this.amount = amount;
  }

  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  /*public Date getMemberExpireDate() {
    return memberExpireDate;
  }*/

 /* public void setExtendedExpiredDate() {
    Date now = new Date();
    Calendar cal = Calendar.getInstance();
    cal.setTime(now);
    // manipulate date
    cal.add(Calendar.MONTH, 1);
    // convert calendar to date
    Date modifiedDate = cal.getTime();
    memberExpireDate = modifiedDate;
  }*/
}
