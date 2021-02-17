package com.example.demo.Entity;

import java.util.Date;

public class MembershipPriceChangehistory {



    private int priceChangeId;

    private Date priceChangeDate;

    private float amount;

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    private String comments;



    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public int getPriceChangeId() {
        return priceChangeId;
    }

    public void setPriceChangeId(int priceChangeId) {
        this.priceChangeId = priceChangeId;
    }

    public Date getPriceChangeDate() {
        return priceChangeDate;
    }

    public void setPriceChangeDate(Date priceChangeDate) {
        this.priceChangeDate = priceChangeDate;
    }
    public void setPriceChangeDate() {
        this.priceChangeDate = new Date();
    }



    @Override
    public String toString( ){
        return "PriceChangeID= " + priceChangeId + "PriceChangeDate= " + priceChangeDate + "amount= " + amount + "comments= " + comments;

    }








}
