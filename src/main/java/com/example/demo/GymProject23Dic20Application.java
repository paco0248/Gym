package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class GymProject23Dic20Application {

    public static void main(String[] args) {
        SpringApplication.run(GymProject23Dic20Application.class, args);

        Member[] members = new Member[10];
        members[0] = new Member();
        members[0].setFullName("pedro","perrz","glez");
        members[0].setJoiningDate(2020,11,11);
        members[0].setGymId();
        members[0].pay(500);

        System.out.println(members[0].getFullName() + members[0].getGymId());

    }
}
