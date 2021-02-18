package com.example.demo;
import com.example.demo.Entity.Member;
import com.example.demo.Entity.MembershipPriceChangehistory;
import com.example.demo.ServiceImpl.MemberServiceImpl;
import com.example.demo.Entity.Payment;
import com.example.demo.ServiceImpl.MembershipPriceChangehistoryServiceImpl;
import com.example.demo.ServiceImpl.PaymentServiceImpl;
import org.springframework.web.bind.annotation.*;


//---------------------------------------------------------------

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
    @GetMapping(value = "/getLastMemberId11feb20")
    public String getLastMemberId11feb20(){
        return memberService.getLastMemberId11feb20();
    }

    @GetMapping(value = "/getLastId12feb21")
    public int getLastId12feb21(){
        return memberService.getLastId12feb21();
    }


    @GetMapping(value = "/memberList")
    public List<Member> getMembers() {
        return memberService.findAll();
    }

    @GetMapping(value = "/memberListWithStatus")
    public List<Member> getMembersAndCheckStatus() {
        return memberService.findAllAndCheckStatus();
    }


    @PostMapping(value = "/createMember")
    public void createMember(@RequestBody Member mem) {
        memberService.insertMember(mem);
    }

  /*  @PostMapping(value = "/createMember13feb21")
    public void createMember13feb21(@RequestBody Member mem) {
        memberService.insertMember13feb21(mem);
    }*/

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
    @PutMapping(value = "/updateMemberExpireDate") //todo change method to look up member by ID or name
    public void updateMemberExpireDate(@RequestBody Member mem) {
        memberService.updateMemberExpireDate(mem);
    }

    @GetMapping(value = "/checkMemberStatus")  //todo broken...
    public String checkMemberStatus(@RequestBody int id){
        return memberService.checkMemberStatus(id);
    }
    @GetMapping("/checkMemberStatus2ndVersion")    // TODO metodo funciona cuando se crean objetos
    public String checkMemberStatus2ndVersion(@RequestParam(value = "id") int id) {
        return memberService.checkMemberStatus(id);
    }





    ////////////////////////////////////////////////////////////////////

    @Resource
    PaymentServiceImpl paymentService;



    @GetMapping(value = "/paymentList")
    public List<Payment> getPayment() {
        return paymentService.findAll();
    }

   /* @GetMapping(value = "/returnTest")
    public String returnTest(){
        return p();
    }*/


    @PostMapping(value = "/createPayment")
    public void createPayment(@RequestBody Payment pay) {
        paymentService.insertPayment(pay);
    }

    @PostMapping(value = "/createPaymentTest")
    public void createPaymentTest(@RequestBody Payment pay) {
        paymentService.insertPaymentTEST(pay);
    }

    @PutMapping(value = "/updatePayment")
    public void UpdatePayment(@RequestBody Payment pay) {
        paymentService.updatePayment(pay);

    }

    @DeleteMapping(value = "/deletePayment")
    public void deletePayment(@RequestBody Payment pay) {
        paymentService.deletePayment(pay);
    }
/////////////////////////////////////////////////////////////////////////////////////////////////

    @Resource
    MembershipPriceChangehistoryServiceImpl membershipPriceChangehistoryService;

    @PostMapping(value = "/createPriceChange")
    public void insertPriceChange(@RequestBody MembershipPriceChangehistory pri){
        membershipPriceChangehistoryService.createPriceChange(pri);
    }
}
