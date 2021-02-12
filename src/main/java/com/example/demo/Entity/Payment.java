package com.example.demo.Entity;
import java.util.Date;

public class Payment {

  public Payment() {

  }

  private int paymentId;

  private String stringTest;

  private Date paymentDate = new Date();

  private float amount;
  private int memberId;
  public int getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(int paymentId) {

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

  public int getMemberId() {
    return memberId;
  }

  public void setMemberId(int memberId) {
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
 public String getStringTest() {
   return stringTest;
 }

  public void setStringTest(String stringTest) {
    this.stringTest = stringTest;
  }
  @Override
  public String toString() {
    return "paymentId= "+paymentId +" " + "stringTest= "+stringTest + "amount=" + amount ;
  }
}
