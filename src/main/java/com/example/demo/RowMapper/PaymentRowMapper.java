package com.example.demo.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.demo.Entity.Payment;
import org.springframework.jdbc.core.RowMapper;

public class PaymentRowMapper implements RowMapper {

    @Override
    public Payment mapRow(ResultSet rs, int arg1) throws SQLException {
        Payment pay = new Payment();


        pay.setPaymentId(rs.getInt("paymentId"));
        pay.setPaymentDate(rs.getDate("paymentDate"));
        pay.setAmount(rs.getFloat("amount"));
        pay.setStringTest(rs.getString("stringTest"));
        pay.setMemberId(rs.getInt("memberId"));


        return pay;
    }
}
