package com.example.demo.Member;


import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.demo.Member.Member;
import org.springframework.jdbc.core.RowMapper;

public class MemberRowMapper implements RowMapper {

    @Override
    public Member mapRow(ResultSet rs, int arg1) throws SQLException {
        Member mem = new Member();

        mem.setMemberId(rs.getString("memberId"));
        mem.setMemberName(rs.getString("memberName"));
        mem.setMemberPhoneNumber(rs.getString("memberPhoneNumber"));
        mem.setMemberDateOfBirth(rs.getString("memberDateOfBirth"));
        mem.setJoiningDate(rs.getString("memberJoiningDate"));
        mem.setExpireDate(rs.getString("memberExpireDate"));
        //mem.extendExpireDate(rs.getString("memberExpireDate"));
        mem.setId(rs.getInt("id"));


        return mem;
    }
}


//todo member id automated?; converted to string for convinience