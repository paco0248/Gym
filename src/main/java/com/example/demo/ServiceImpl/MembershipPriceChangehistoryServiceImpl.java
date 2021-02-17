package com.example.demo.ServiceImpl;

import java.util.List;

import javax.annotation.Resource;

import com.example.demo.DaoImpl.MemberDaoImpl;
import com.example.demo.DaoImpl.MembershipPriceChangehistoryDaoImpl;
import com.example.demo.DaoImpl.PaymentDaoImpl;
import com.example.demo.Entity.Member;
import com.example.demo.Entity.MembershipPriceChangehistory;
import com.example.demo.Entity.Payment;
import org.springframework.stereotype.Component;

@Component
public class MembershipPriceChangehistoryServiceImpl {

    @Resource
    MembershipPriceChangehistoryDaoImpl membershipPriceChangehistoryDao;


    public int getLastPriceMod(){
        MembershipPriceChangehistory pri = new MembershipPriceChangehistory();

        System.out.println(membershipPriceChangehistoryDao.getLastPriceMod(pri.getPriceChangeId()));
        return membershipPriceChangehistoryDao.getLastPriceMod(pri.getPriceChangeId()).getPriceChangeId(); //todo me queda duda
    }

    public void createPriceChange(MembershipPriceChangehistory pri){
        pri.setPriceChangeDate();
        membershipPriceChangehistoryDao.createPriceChange(pri);
        System.out.println(pri.toString());
    }
}
