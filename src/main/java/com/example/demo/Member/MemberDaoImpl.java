package com.example.demo.Member;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDaoImpl {

    public MemberDaoImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    NamedParameterJdbcTemplate template;

    public List<Member> findAll() {
        return template.query("select * from member", new MemberRowMapper());

    }



    public void insertMember(Member mem) {
        final String sql = "insert into member(memberId, memberName, memberPhoneNumber, memberDateOfBirth) values(:memberId,:memberName,:memberPhoneNumber,:memberDateOfBirth)";

        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("memberId", mem.getMemberId())
                .addValue("memberName", mem.getMemberName())
                .addValue("memberPhoneNumber", mem.getMemberPhoneNumber())
                .addValue("memberDateOfBirth", mem.getMemberDateOfBirth());
        template.update(sql,param, holder);

    }

    public void updateMember(Member mem) {
        final String sql = "update member set memberName=:memberName, memberDateOfBirth=:memberDateOfBirth, memberPhoneNumber=:memberPhoneNumber where memberId=:memberId";

        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("memberId", mem.getMemberId())
                .addValue("memberName", mem.getMemberName())
                .addValue("memberDateOfBirth", mem.getMemberDateOfBirth())
                .addValue("memberPhoneNumber", mem.getMemberPhoneNumber());
        template.update(sql,param, holder);
    }

    public void executeUpdateMember (Member mem) {
        final String sql =  "update member set memberName=:memberName, memberDateOfBirth=:memberDateOfBirth, memberPhoneNumber=:memberPhoneNumber where memberId=:memberId";


        Map<String,Object> map=new HashMap<String,Object>();
        map.put("memberId", mem.getMemberId());
        map.put("memberName", mem.getMemberName());
        map.put("memberPhoneNumber", mem.getMemberPhoneNumber());
        map.put("memberDateOfBirth", mem.getMemberDateOfBirth());

        template.execute(sql,map,new PreparedStatementCallback<Object>() {
            @Override
            public Object doInPreparedStatement(PreparedStatement ps)
                    throws SQLException, DataAccessException {
                return ps.executeUpdate();
            }
        });


    }

    public void deleteCliente(Member mem) {
        final String sql = "delete from member where memberId=:memberId";


        Map<String,Object> map=new HashMap<String,Object>();
        map.put("memberId", mem.getMemberId());

        template.execute(sql,map,new PreparedStatementCallback<Object>() {
            @Override
            public Object doInPreparedStatement(PreparedStatement ps)
                    throws SQLException, DataAccessException {
                return ps.executeUpdate();
            }
        });


    }
}


