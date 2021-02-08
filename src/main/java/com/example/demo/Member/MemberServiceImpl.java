package com.example.demo.Member;

import java.util.List;

import javax.annotation.Resource;

import com.example.demo.GymController;
import com.example.demo.Member.Member;
import com.example.demo.Member.MemberDaoImpl;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceImpl {
    @Resource
    MemberDaoImpl memberDao;


    public List<Member> findAll() {
        return memberDao.findAll();
    }
    public Member getLastMemberId(){
        return memberDao.getLastMemberId();
    }

    public void insertMember(Member mem) {

        mem.setJoiningDate();
        mem.setExpireDate();
        memberDao.insertMember(mem);
    }
    public void insertMemberWoId(Member mem) {

        mem.setMemberId(getLastMemberId().toString());
        mem.setJoiningDate();
        mem.setExpireDate();
        memberDao.insertMemberWoId(mem);
    }

    public void updateMember(Member mem) {
        memberDao.updateMember(mem);
    }

    public void executeUpdateMember(Member mem) {
        memberDao.executeUpdateMember(mem);

    }

    public void deleteMember(Member mem) {
       memberDao.deleteCliente(mem);

    }



}


