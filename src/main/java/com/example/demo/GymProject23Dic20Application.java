package com.example.demo;

import com.example.demo.DaoImpl.MemberDaoImpl;
import com.example.demo.DaoImpl.PaymentDaoImpl;
import com.example.demo.Entity.Member;
import com.example.demo.Entity.MembershipPriceChangehistory;
import com.example.demo.Entity.Payment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GymProject23Dic20Application {

    public static void main(String[] args) {
        SpringApplication.run(GymProject23Dic20Application.class, args);


        MembershipPriceChangehistory pri = new MembershipPriceChangehistory();
        Member mem = new Member();
        mem.extendExpireDate();
        mem.setNow();
        String a = mem.toString();
        String z = pri.toString();


        System.out.println("shit" + z);




    }
}
