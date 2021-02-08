package com.example.demo.Payment;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.demo.Payment.Payment;
import org.springframework.jdbc.core.RowMapper;

public class PaymentRowMapper implements RowMapper {

    @Override
    public Payment mapRow(ResultSet rs, int arg1) throws SQLException {
        Payment pay = new Payment();


        pay.setPaymentId(rs.getString("paymentId"));
        pay.setPaymentDate(rs.getString("paymentDate"));
        pay.setAmount(rs.getString("amount"));
        pay.setMemberId(rs.getString("memberId"));
        pay.setId(rs.getInt("id"));

        return pay;
    }
}
