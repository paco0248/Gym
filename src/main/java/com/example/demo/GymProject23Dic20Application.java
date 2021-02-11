package com.example.demo;

import com.example.demo.DaoImpl.MemberDaoImpl;
import com.example.demo.Entity.Member;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GymProject23Dic20Application {

    public static void main(String[] args) {
        SpringApplication.run(GymProject23Dic20Application.class, args);





        Member mem = new Member();
        mem.extendExpireDate();
        String a = mem.getExtendedExpireDate().toString();



        System.out.println("shit" + a);




    }
}
