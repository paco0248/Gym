package com.example.demo.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.demo.Model.Payment;
import org.springframework.jdbc.core.RowMapper;

public class PaymentRowMapper implements RowMapper {

    @Override
    public Payment mapRow(ResultSet rs, int arg1) throws SQLException {
        Payment pay = new Payment();


        pay.setPaymentId(rs.getString("paymentId"));
        pay.setPaymentDate(rs.getDate("paymentDate"));
        pay.setAmount(rs.getFloat("amount"));
        //pay.setMemberId(rs.getString("memberId"));


        return pay;
    }
}
