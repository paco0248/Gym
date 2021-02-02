package com.example.demo;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component
public class MemberServiceImpl {
    @Resource
    MemberDaoImpl memberDao;

    public List<Member> findAll() {
        return memberDao.findAll();
    }

    public void insertMember(Member mem) {
        memberDao.insertMember(mem);
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


