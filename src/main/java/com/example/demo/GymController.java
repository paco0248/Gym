package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class  GymController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/members")
    public Member[] greeting(@RequestParam(value = "name") String name) {
        System.out.println(name);
        Member[] members = new Member[10];
        members[0] = new Member();
        members[0].setFullName("pedro","perrz","glez");
        members[0].setJoiningDate(2020,11,11);
        members[0].pay(500);

        System.out.println(members[0].getFullName());
        return members;
    }




}
