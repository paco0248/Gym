package com.example.demo.RowMapper;


import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.demo.Entity.Member;
import org.springframework.jdbc.core.RowMapper;

public class MemberRowMapper implements RowMapper {

    @Override
    public Member mapRow(ResultSet rs, int arg1) throws SQLException {
        Member mem = new Member();

        mem.setMemberId(rs.getString("memberId"));
        mem.setMemberName(rs.getString("memberName"));
        mem.setMemberPhoneNumber(rs.getString("memberPhoneNumber"));
        mem.setMemberDateOfBirth(rs.getString("memberDateOfBirth"));
        mem.setMemberJoiningDate(rs.getDate("memberJoiningDate"));
        mem.setExpireDate(rs.getDate("memberExpireDate"));
        mem.setExtendedExpireDate(rs.getDate("memberExpireDate"));
        mem.setId(rs.getInt("id"));
        mem.setMemberStatus(mem.getMemberStatus());
        mem.setMemberStatus();



        return mem;
    }
}


//todo member id automated?; converted to string for convinience