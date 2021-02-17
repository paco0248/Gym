package com.example.demo.RowMapper;

import com.example.demo.Entity.MembershipPriceChangehistory;
import com.example.demo.Entity.Payment;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MembershipPriceChangehistoryRowMapper implements RowMapper {



    @Override
    public MembershipPriceChangehistory mapRow(ResultSet rs, int arg1) throws SQLException {
        MembershipPriceChangehistory pri = new MembershipPriceChangehistory();


        pri.setPriceChangeId(rs.getInt("priceChangeId"));
        pri.setAmount(rs.getFloat("amount"));
        pri.setPriceChangeDate(rs.getDate("priceChangeDate"));
        pri.setComments(rs.getString("comments"));



        return pri;
    }
}
