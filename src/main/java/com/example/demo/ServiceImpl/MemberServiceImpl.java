package com.example.demo.ServiceImpl;

import java.util.List;

import javax.annotation.Resource;

import com.example.demo.DaoImpl.MemberDaoImpl;
import com.example.demo.DaoImpl.PaymentDaoImpl;
import com.example.demo.Entity.Member;
import com.example.demo.Entity.Payment;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceImpl {
    @Resource
    MemberDaoImpl memberDao;
    @Resource
    PaymentDaoImpl paymentDao;


    public List<Member> findAll() {
        return memberDao.findAll();
    }

    public Member getLastMemberId(){
        return memberDao.getLastMemberId();
    }

    public String getLastMemberId11feb20(){
        Member mem = new Member();
        System.out.println(memberDao.getLastMemberId11feb20(mem).toString());
        return memberDao.getLastMemberId11feb20(mem).toString();
    }
    public int getLastId12feb21(){
        Member mem = new Member();
        System.out.println(memberDao.getLastId12feb21(mem));
        return memberDao.getLastId12feb21(mem).getId();
    }


    public void insertMember(Member mem) {
        mem.setJoiningDate(); //todo necesito esto?
        mem.setExpireDate();
        mem.assignMemberStatus();
        memberDao.insertMember(mem);
        System.out.println(mem.toString());
    }
    public void insertMemberWoId(Member mem) {
        mem.setMemberId(getLastMemberId().toString());
        mem.setJoiningDate();
        mem.setExpireDate();
        memberDao.insertMemberWoId(mem);
    }
    public void insertMember13feb21(Member mem) {

        mem.setExpireDate();
        memberDao.insertMember(mem);
        Payment pay = new Payment();
        pay.setMemberId(memberDao.getLastId12feb21(mem).getId());
        pay.setAmount();
       paymentDao.insertPayment(pay);

        System.out.println(mem.toString() + pay.toString());
    }

    public void updateMember(Member mem) {
        memberDao.updateMember(mem);
    }

    public void executeUpdateMember(Member mem) {
        memberDao.executeUpdateMember(mem);

    }

    public void updateMemberExpireDate(Member mem) {
        mem.setExpireDate();
        memberDao.extendMembership(mem);
    }

    public void executeUpdateMemberExpireDate(Member mem) {
        memberDao.executeExtendMembership(mem);

    }

    public void deleteMember(Member mem) {
       memberDao.deleteCliente(mem);

    }
    public String checkMemberStatus(int id){

        Member mem = memberDao.getMemberbyId(id);
        mem.assignMemberStatus();

        //memberDao.getMemberStatus.toString;
        memberDao.updateMemberStatusOnDB(memberDao.getMemberbyId(id));
        memberDao.updateMemberStatusOnDB2ndVersion(memberDao.getMemberbyId(id));
        memberDao.updateStatusOnDB(memberDao.getMemberbyId(id));
        memberDao.executeUpdateStatusOnDB(memberDao.getMemberbyId(id));
        System.out.println(mem.getMemberStatus());
        System.out.println(mem.toString());
        return mem.getMemberStatus();
    }


}


