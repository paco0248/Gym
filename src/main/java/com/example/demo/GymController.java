package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class  GymController {
    public GymController(){
         members = new Member[10];
        {
            for (int i = 0; i < 10; i++) {
                members[i] = new Member();
                members[i].setFullName();
                members[i].setGymId();
            }
        }
    }

    @GetMapping("/createMember")
    public Member[] greeting(@RequestParam(value = "firstName") String firstName,
                             @RequestParam(value = "lastName1") String lastName,
                             @RequestParam(value = "lastName2") String lastName2,
                             @RequestParam(value = "day") int day,
                             @RequestParam(value = "month") int month,
                             @RequestParam(value = "year") int year,
                             @RequestParam(value = "index") int i)
    {
        members[i] = new Member();
        members[i].setFullName(firstName,lastName,lastName2);
        members[i].setGymId();
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
        members[i].setFullName(firstName, lastName, lastName2);
        members[i].setDob(day, month, year);
        members[i].setGymId();
        return  members;
    }
    @GetMapping("/getMember")
    public Member[] greetingB(@RequestParam(value = "index") int i)
    {
        System.out.println("getMember method invoked(read)");
        Member[] memberMethodUtility = new Member[10];
        memberMethodUtility[0] = new Member();
        memberMethodUtility[0] = members[i];
        return memberMethodUtility;
    }
    @GetMapping("/deleteMember")
    public Member[] greetingC(@RequestParam(value = "index") int i)
    {
        System.out.println("deleteMember method invoked(delete)");
        members[i] = null;
        Member[] temp = new Member[members.length-1];
        for (int a = 0; i < 10; i++){
            if(members[a] != null){
                temp[a] = members[a];
            }
        }
        members = new Member[temp.length];
        members = temp;
        return members;
    }
    private Member[] members;

}
