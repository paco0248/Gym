package com.example.demo;


import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class MemberRowMapper implements RowMapper {

    @Override
    public Member mapRow(ResultSet rs, int arg1) throws SQLException {
        Member mem = new Member();

        mem.setMemberId(rs.getString("memberId"));
        mem.setFullName(rs.getString("memberName"));
        mem.setFullName(rs.getString("memberPhoneNumber"));
        mem.setFullName(rs.getString("memberDateOfBirth"));
        return mem;
    }
}
//todo member id automated?; converted to string for convinience