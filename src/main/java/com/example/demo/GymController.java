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
    @GetMapping("/createMember")    // TODO metodo funciona cuando se crean objetos
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
    public Member greetingA(@RequestParam(value = "firstName") String firstName,
                             @RequestParam(value = "lastName1") String lastName,
                             @RequestParam(value = "lastName2") String lastName2,
                             @RequestParam(value = "day") int day,
                             @RequestParam(value = "month") int month,
                             @RequestParam(value = "year") int year,
                              @RequestParam(value = "index") int i) {
        members[i].setFullName(firstName, lastName, lastName2);
        members[i].setDob(day, month, year);
        members[i].setGymId();
        return  members[i];
    }
    @GetMapping("/getMember")
    public Member greetingB(@RequestParam(value = "index") int i) {
        System.out.println("getMember method invoked(read)");
        return members[i];
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
        members[index].getMemberPayment(0).setMemberName(members[index].getFullName());
        return members[index].getMemberPayment(0);
        }

    @GetMapping("/getPayment")
    public Payment greetingE(@RequestParam(value = "name", defaultValue = "World") int index) {
        System.out.println("getPayment");
        members[index].getMemberPayment(0);  // TODO porqur cero
        return members[index].getMemberPayment(0);
    }
    @GetMapping("/modifyPayment")
    public Payment greetingF(@RequestParam(value = "name", defaultValue = "World") int index,
                             @RequestParam(value = "wichPaymentToModify", defaultValue = "World") int secondaryIndex,
                             @RequestParam(value = "changeAmount", defaultValue = "World") int newAmount,
                             @RequestParam(value = "changeBalance", defaultValue = "World") int newBalance) {
        System.out.println("modifyPayment");
        members[index].memberPaymentHistory[secondaryIndex].setAmount(newAmount);
        members[index].memberPaymentHistory[secondaryIndex].setBalance(newBalance);
        members[index].memberPaymentHistory[secondaryIndex].setPaymentDate(); //TODO overload method
        members[index].getMemberPayment(secondaryIndex);  // TODO porqur cero
        return members[index].getMemberPayment(secondaryIndex);
    }
    @GetMapping("/deletePayment")
    public Payment[] greetingH(@RequestParam(value = "whatMember", defaultValue = "World") int index,
                             @RequestParam(value = "whatPayment", defaultValue = "World") int secIndex){
        System.out.println("payment deleted");
        members[index].setMemberPaymentToNull(secIndex);
        Payment[] temp = new Payment[members[index].memberPaymentHistory.length-1];
        int z = 0;
        for (int i = 0; i < members[index].memberPaymentHistory.length; i++){
            if(members[index].memberPaymentHistory[i] != null){
                temp[z] = members[index].memberPaymentHistory[i];
                z++;
            }
        }
        members[index].setMemberPaymentHistory(temp);
    return members[index].memberPaymentHistory;
    }




    private Member[] members;
    private Payment[] payment = new Payment[5];

}
