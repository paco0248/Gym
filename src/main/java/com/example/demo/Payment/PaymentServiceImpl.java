package com.example.demo.Payment;

import java.util.List;

import javax.annotation.Resource;

import com.example.demo.Member.Member;
import com.example.demo.Member.MemberDaoImpl;
import org.springframework.stereotype.Component;

@Component
public class PaymentServiceImpl {
    @Resource
    PaymentDaoImpl paymentDao;

    public List<Payment> findAll() {
        return paymentDao.findAll();
    }

   public void insertPayment(Payment pay) {
        paymentDao.insertPayment(pay);
        paymentDao.extendMembership(pay); //todo separar a clase correcta
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
