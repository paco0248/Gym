package com.example.demo.ServiceImpl;

import java.util.List;

import javax.annotation.Resource;

import com.example.demo.DaoImpl.MemberDaoImpl;
import com.example.demo.DaoImpl.PaymentDaoImpl;
import com.example.demo.Model.Member;
import com.example.demo.Model.Payment;
import org.springframework.stereotype.Component;

@Component
public class PaymentServiceImpl {
    @Resource
    PaymentDaoImpl paymentDao;

    @Resource
    MemberDaoImpl memberDao;

    public List<Payment> findAll() {
        return paymentDao.findAll();
    }

   public void insertPayment(Payment pay, Member mem) {
        paymentDao.insertPayment(pay);
        mem.extendExpireDate();
        memberDao.extendMembership(mem);
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
