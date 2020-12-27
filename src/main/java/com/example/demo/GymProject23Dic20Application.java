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
        members[0].setFullName("pedro","perez","mendez");
        members[0].setGymId();
        members[0].setJoiningDate(2020, 11, 25);

        members[1] = new Member();
        members[1].setFullName("pepe","gomez","glez");
        members[1].setGymId();
        members[1].setJoiningDate(2020,12, 11);

        for(int i)
        System.out.println(e.);
    }
}
