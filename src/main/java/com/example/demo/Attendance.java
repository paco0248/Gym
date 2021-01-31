package com.example.demo;

import java.util.Date;

public class Attendance {
    public Attendance(){ }
    private int z = 0;
    private Attendance[] assistanceLog = new Attendance[z+1];
    private Date assistance;

    public void registerAssistance(){
        assistanceLog[z] = new Attendance();
    }



}
