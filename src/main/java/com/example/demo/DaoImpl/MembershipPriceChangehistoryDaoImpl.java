package com.example.demo.DaoImpl;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.demo.Entity.Member;
import com.example.demo.Entity.MembershipPriceChangehistory;
import com.example.demo.RowMapper.MemberRowMapper;
import com.example.demo.RowMapper.MembershipPriceChangehistoryRowMapper;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;


@Repository
public class MembershipPriceChangehistoryDaoImpl {

    public MembershipPriceChangehistoryDaoImpl(NamedParameterJdbcTemplate template){this.template = template; }

    NamedParameterJdbcTemplate template;

    public MembershipPriceChangehistory getAmountFromDBbyId (int priceChangeId) {
        final String sql = "select * from membershipPriceChangehistory  where priceChangeId=:priceChangeId;";

        SqlParameterSource param = new MapSqlParameterSource()
                .addValue("priceChangeId", priceChangeId);

        return (MembershipPriceChangehistory) template.queryForObject(
                sql,
                param, new MembershipPriceChangehistoryRowMapper());

    }




}
//NamedParameterJdbcTemplate template