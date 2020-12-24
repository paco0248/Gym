package com.example.demo;

//commit del dia

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

public class Member {

    public Member(){

    }

    public Member(String p, String fn, String ln1, String ln2,
                  int Id, Date jd, Date ed, String ms, Array ph, Array ma){
        photo = p;
	//photo  =  p;
        firstName = fn;
        lastName1 = ln1;
        lastName2 = ln2;
        GymId = Id;
        joiningDate = jd;
        expireDate = ed;
        memberStatus = ms;
        paymentHistory = ph;
        memberAttendance = ma;
    }

    public String setFullName(String name)
    public String getFullName(){
        return firstName+lastName1+lastName2;
    }
    /*public ArrayList viewMember(){
        return
    }*/


    private String photo;
    private String firstName;
    private String lastName1;
    private String lastName2;
    private int GymId;
    private Date joiningDate;
    private Date expireDate;
    private String memberStatus;
    private Array paymentHistory;
    private Array memberAttendance;
}
