package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class  GymController {

    public GymController(){    //TODO void methods pueden convertirse a VOID, despues hacer un get method para corroborrar accion
         members = new Member[z+1];

    }

    @GetMapping("/createMember")    // TODO metodo funciona cuando se crean objetos?
    public Member greeting(@RequestParam(value = "memberName") String name) {
        tempo = new Member[members.length+1];
        for(int i = 0; i < tempo.length-1; i++){
            tempo[i] = members[i];
        }
        members = new Member[tempo.length];
        for (int i = 0; i < tempo.length-1; i++){
            members[i] = tempo[i];
        }

        members[z] = new Member();
        members[z].setFullName(name);
        members[z].setGymId();
        z++;
        System.out.println(members[z-1].getJoiningDate().toString());

        return members[z-1];
    }
    @GetMapping("/modifyMember") //todo change method to look up member by ID or name
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
    public Member greetingB(@RequestParam(value = "index") int i) {   //todo change method to look up member by ID or name

        return members[i];
    }
    @GetMapping("/getAllMembers")
    public Member[] greetingI(@RequestParam(value = "index") int i) {
        System.out.println("getAllMembers method invoked(read)");
        return members;
    }
    @GetMapping("/deleteMember")
    public void greetingC(@RequestParam(value = "index") int x) {
        System.out.println("deleteMember method invoked(delete)");
        members[x] = null;  //TODO FIXh
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
    public Payment greetingE(@RequestParam(value = "name", defaultValue = "World") int index,
                             @RequestParam(value = "paymentNumber", defaultValue = "World") int secIndex) {
        System.out.println("getPayment");
        members[index].getMemberPayment(secIndex);
        return members[index].getMemberPayment(secIndex);
    }
    @GetMapping("/getAllPayments")
    public Payment[] getAllPayments(@RequestParam(value = "name", defaultValue = "World") int index) {
        System.out.println("getPayment");
        return members[index].getMemberPaymentHistory();
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
    @GetMapping("/registerAttendance")
    public Payment[] greetingL(@RequestParam(value = "whatMember", defaultValue = "World") int index,
                               @RequestParam(value = "whatPayment", defaultValue = "World") int secIndex){

    return payment;
    }


    private Member[] members;
    private Member[] tempo;
    private Payment[] payment = new Payment[5];
    private int z= 0;  //todo understand array shit breaking
}
