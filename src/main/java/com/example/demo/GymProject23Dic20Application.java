package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GymProject23Dic20Application {

    public static void main(String[] args) {
        SpringApplication.run(GymProject23Dic20Application.class, args);

        Member a = new Member();
        Member b = new Member();
        a.setFullName("pedro","perez","mendez");
        a.setGymId();
        b.setGymId();
        a.setJoiningDate(2020, 11, 25);
        b.setJoiningDate(2020,12, 11);



        a.pay(500);

        System.out.println(a.getFullName() + " " + a.getGymId() + " " + a.getJoiningDate());
        System.out.println(b.getGymId() + " " + b.getJoiningDate());
        System.out.println(a.getMemberStatus() + " " + Member.getTransaccionID() );
    }
}
