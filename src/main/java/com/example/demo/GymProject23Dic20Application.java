package com.example.demo;

import com.example.demo.Model.Member;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GymProject23Dic20Application {

    public static void main(String[] args) {
        SpringApplication.run(GymProject23Dic20Application.class, args);


        Member mem = new Member();




        System.out.println("shit" + mem.getMemberJoiningDate().toString());




    }
}
