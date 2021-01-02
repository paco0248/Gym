package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class  GymController {
    public GymController(){    //TODO void methods pueden convertirse a VOID, despues hacer un get method para corroborrar accion
         members = new Member[10];
        {
            for (int i = 0; i < 10; i++) {
                members[i] = new Member();
                members[i].setFullName("fuckfuck");
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
                             @RequestParam(value = "index") int i) {
        members[i] = new Member();
        members[i].setFullName(firstName,lastName,lastName2);
        members[i].setGymId(); //TODO BOD Breaks Methods? and convert to void.
        return members;
    }
    @GetMapping("/modifyMember")
    public Member[] greetingA(@RequestParam(value = "firstName") String firstName,
                             @RequestParam(value = "lastName1") String lastName,
                             @RequestParam(value = "lastName2") String lastName2,
                             @RequestParam(value = "day") int day,
                             @RequestParam(value = "month") int month,
                             @RequestParam(value = "year") int year,
                              @RequestParam(value = "index") int i) {
        members[i].setFullName(firstName, lastName, lastName2);
        members[i].setDob(day, month, year);
        members[i].setGymId();
        return  members;
    }
    @GetMapping("/getMember")
    public Member[] greetingB(@RequestParam(value = "index") int i) {
        System.out.println("getMember method invoked(read)");
        Member[] memberMethodUtility = new Member[10];
        memberMethodUtility[0] = new Member();
        memberMethodUtility[0] = members[i];
        return memberMethodUtility;
    }
    @GetMapping("/deleteMember")
    public Member[] greetingC(@RequestParam(value = "index") int x) {
        System.out.println("deleteMember method invoked(delete)");
        members[x] = null;  //TODO FIX
       Member[] temp = new Member[members.length-1];
       int z = 0;
       for (int i = 0; i < members.length; i++){
           if(members[i] != null ){
                temp[z] = members[i];
               z++;
            }
           System.out.println(1);
        }
        members = new Member[temp.length];
        members = temp;
        return members;
    }
    @GetMapping("/makePayment")
    public Payment greetingD(@RequestParam(value = "name", defaultValue = "World") int index,
                             @RequestParam(value = "amount", defaultValue = "World") int amount) {
            System.out.println("payMethod");
            members[index].pay(amount);
        members[index].getMemberPayment().setMemberName(members[index].getFullName());
        //return new Greeting(counter.incrementAndGet(), String.format(template, name));
        return members[index].getMemberPayment();
        }

    @GetMapping("/getPayment")
    public Payment[] greetingE(@RequestParam(value = "name", defaultValue = "World") int index) {
        System.out.println("getPayment");
        payment = members[index].getMemberPaymentHistory(index);

        return payment;

        //return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }


    private Member[] members;
    private Payment[] payment;

}
