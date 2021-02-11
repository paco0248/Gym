package com.example.demo.ServiceImpl;

import java.util.List;

import javax.annotation.Resource;

import com.example.demo.DaoImpl.MemberDaoImpl;
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
    MemberServiceImpl memberService;

    public List<Payment> findAll() {
        return paymentDao.findAll();
    }

    public String returnStringTest(){
        return paymentDao.returnStringTest();
    }

   public void insertPayment(Payment pay) {
        paymentDao.insertPayment(pay);
            mem.extendExpireDate();
            mem.getExtendedExpireDate();
            mem.setExpireDate();
        memberDao.extendMembership(mem);
        memberService.updateMemberExpireDate(mem);

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
