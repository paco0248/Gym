package com.example.demo.Payment;


import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.demo.Member.Member;
import com.example.demo.Member.MemberRowMapper;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

@Repository

public class PaymentDaoImpl {

    public PaymentDaoImpl(NamedParameterJdbcTemplate template) {
        this.template = template;
    }

    NamedParameterJdbcTemplate template;

    public List<Payment> findAll() {
        return template.query("select * from payment", new PaymentRowMapper());

    }



    public void insertPayment(Payment pay) {
        final String sql = "insert into payment(paymentId, paymentDate, amount, memberId) values(:paymentId, :paymentDate, :amount, :memberId)";

        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("paymentId", pay.getPaymentId())
                .addValue("paymentDate", pay.getPaymentDate())
                .addValue("amount", pay.getAmount())
                .addValue("memberId", pay.getMemberId());
        template.update(sql,param, holder);

    }

    public void updatePayment(Payment pay) {
        final String sql = "update payment set memberId=:memberId, paymentDate=:paymentDate, amount=:amount where paymentId=:paymentId";

        KeyHolder holder = new GeneratedKeyHolder();
        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("memberId", pay.getMemberId())
                .addValue("paymentId", pay.getPaymentId())
                .addValue("paymentDate",pay.getPaymentDate())
                .addValue("amount", pay.getAmount());
        template.update(sql,param, holder);
    }

    public void executeUpdatePayment (Payment pay) {
        final String sql =  "update payment set memberId=:memberId, paymentDate=:paymentDate, amount=:amount where paymentId=:paymentId";


        Map<String,Object> map=new HashMap<String,Object>();
        map.put("memberId", pay.getMemberId());
        map.put("paymentId", pay.getPaymentId());
        map.put("paymentDate",pay.getPaymentDate());
        map.put("amount", pay.getAmount());

        template.execute(sql,map,new PreparedStatementCallback<Object>() {
            @Override
            public Object doInPreparedStatement(PreparedStatement ps)
                    throws SQLException, DataAccessException {
                return ps.executeUpdate();
            }
        });


    }

    public void deletePayment(Payment pay) {
        final String sql = "delete from payment where paymentId=:paymentId";


        Map<String,Object> map=new HashMap<String,Object>();
        map.put("paymentId", pay.getPaymentId());

        template.execute(sql,map,new PreparedStatementCallback<Object>() {
            @Override
            public Object doInPreparedStatement(PreparedStatement ps)
                    throws SQLException, DataAccessException {
                return ps.executeUpdate();
            }
        });


    }
}




