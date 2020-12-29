package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class  GymController {

    /*private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();*/

    @GetMapping("/createMember")
    public Member[] greeting(@RequestParam(value = "firstName") String firstName,
                             @RequestParam(value = "lastName1") String lastName,
                             @RequestParam(value = "lastName2") String lastName2,
                             @RequestParam(value = "day") int day,
                             @RequestParam(value = "month") int month,
                             @RequestParam(value = "year") int year)
    {
        System.out.println("getMember method");

        members[0] = new Member(day, month, year);
        members[0].setFullName(firstName,lastName,lastName2);
       // members[0].setJoiningDate(2020,11,11);
        members[0].setGymId();
        return members;
    }

    @GetMapping("/modifyMember")
    public Member[] greetingA(@RequestParam(value = "firstName") String firstName,
                             @RequestParam(value = "lastName1") String lastName,
                             @RequestParam(value = "lastName2") String lastName2,
                             @RequestParam(value = "day") int day,
                             @RequestParam(value = "month") int month,
                             @RequestParam(value = "year") int year,
                              @RequestParam(value = "index") int i)
    {
        System.out.println("modifyMember method invoked");
        members[i] = new Member(day, month, year);   // SHIT SHIT SHIT SHIT SHIT SHIT SHIT SHIT SHIT SHIT SHIT
        members[i].setFullName(firstName, lastName, lastName2);
        members[i].setDob(day, month, year);
        members[i].setGymId();
        members[i].
        return  members;
    }
    @GetMapping("/getMember")
    public Member[] greetingB(@RequestParam(value = "firstName") String firstName,
                              @RequestParam(value = "lastName1") String lastName,
                              @RequestParam(value = "lastName2") String lastName2,
                              @RequestParam(value = "day") int day,
                              @RequestParam(value = "month") int month,
                              @RequestParam(value = "year") int year,
                              @RequestParam(value = "index") int i)
    {
        System.out.println("modifyMember method invoked");
        Member[] getMemberMethodUtility = new Member[0];
        getMemberMethodUtility[0] = new Member();
        getMemberMethodUtility[0] = members[i];
        return getMemberMethodUtility;
    }

    Member[] members = new Member[10];


}
