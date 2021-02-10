package com.example.demo;
import com.example.demo.Model.Member;
import com.example.demo.ServiceImpl.MemberServiceImpl;
import com.example.demo.Model.Payment;
import com.example.demo.ServiceImpl.PaymentServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.web.bind.annotation.RequestMapping;
//---------------------------------------------------------------
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;
import java.util.List;
//-------------------------------------------------------

@RestController
@RequestMapping("/gymApp")
public class  GymController {

    @Resource
    MemberServiceImpl memberService ;

    @GetMapping(value = "/getLastMemberId")
    public String getLastMemberId(){
        return memberService.getLastMemberId().getMemberId();
    }

    @GetMapping(value = "/memberList")
    public List<Member> getMembers() {
        return memberService.findAll();
    }

    @PostMapping(value = "/createMember")
    public void createMember(@RequestBody Member mem) {
        memberService.insertMember(mem);
    }

    @PostMapping(value = "/createMemberWoId")
    public void createMemberWoId(@RequestBody Member mem) {
        memberService.insertMemberWoId(mem);
    }

    @PutMapping(value = "/updateMember") //todo change method to look up member by ID or name
    public void UpdateMember(@RequestBody Member mem) {
        memberService.updateMember(mem);
    }
    @DeleteMapping(value = "/deleteMember")
    public void deleteMember(@RequestBody Member mem) {
        memberService.deleteMember(mem);
    }



    @Resource
    PaymentServiceImpl paymentService;



    @GetMapping(value = "/paymentList")
    public List<Payment> getPayment() {
        return paymentService.findAll();
    }

    @PostMapping(value = "/createPayment")
    public void createPayment(@RequestBody Payment pay, Member mem) {
        paymentService.insertPayment(pay, mem);
    }

    @PutMapping(value = "/updatePayment")
    public void UpdatePayment(@RequestBody Payment pay) {
        paymentService.updatePayment(pay);

    }

    @DeleteMapping(value = "/deletePayment")
    public void deletePayment(@RequestBody Payment pay) {
        paymentService.deletePayment(pay);
    }

}
