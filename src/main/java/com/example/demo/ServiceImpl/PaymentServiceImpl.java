package com.example.demo.ServiceImpl;

import java.util.List;

import javax.annotation.Resource;

import com.example.demo.DaoImpl.MemberDaoImpl;
import com.example.demo.DaoImpl.MembershipPriceChangehistoryDaoImpl;
import com.example.demo.DaoImpl.PaymentDaoImpl;
import com.example.demo.Entity.Member;
import com.example.demo.Entity.Payment;
import org.springframework.stereotype.Component;

@Component
public class PaymentServiceImpl {
    @Resource
    PaymentDaoImpl paymentDao;

    @Resource
    MemberDaoImpl memberDao;

    @Resource
    MemberServiceImpl memberService;  //todo esto no deberia estar aqui
    @Resource
    MembershipPriceChangehistoryDaoImpl membershipPriceChangehistoryDao;


    public List<Payment> findAll() {
        return paymentDao.findAll();
    }



   public void insertPayment(Payment pay) {
        //pay.setAmount(); //todo poor implementation
        paymentDao.insertPayment(pay);
        Member mem  = memberDao.getMemberbyId(pay.getMemberId());
        mem.extendExpireDate();
       memberDao.extendMembership(mem);
       System.out.println(mem.toString());
       System.out.println();
    }

    public void insertPaymentTEST(Payment pay) {
        pay.setAmount(membershipPriceChangehistoryDao.getAmountFromDBbyId(1).getAmount());
        //pay.setAmount(); //todo poor implementation
        paymentDao.insertPayment(pay);
        Member mem  = memberDao.getMemberbyId(pay.getMemberId());
        mem.extendExpireDate();
        memberDao.extendMembership(mem);
        System.out.println(mem.toString());

        System.out.println(pay.toString());
    }




    public void updatePayment(Payment pay) {
        paymentDao.updatePayment(pay);
    }

    public void executeUpdatePayment(Payment pay) {
        paymentDao.executeUpdatePayment(pay);

    }

    public void deletePayment(Payment pay) {
        paymentDao.deletePayment(pay);

    }


}
