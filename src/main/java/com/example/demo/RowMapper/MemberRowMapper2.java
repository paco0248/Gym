package com.example.demo.RowMapper;

import com.example.demo.Model.Member;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MemberRowMapper2 implements RowMapper {

    @Override
    public Member mapRow(ResultSet rs, int arg1) throws SQLException {
        Member mem = new Member();

        mem.setMemberId(rs.getString("memberId"));

        return mem;
    }

}
