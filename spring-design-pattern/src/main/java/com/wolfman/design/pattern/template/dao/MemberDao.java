package com.wolfman.design.pattern.template.dao;

import com.wolfman.design.pattern.template.JDBCTemplate;
import com.wolfman.design.pattern.template.RowMapper;
import com.wolfman.design.pattern.template.entity.Member;

import java.sql.ResultSet;
import java.util.List;

public class MemberDao {

    //为什么不继承，主要是为了解耦
    private JDBCTemplate JdbcTemplate = new JDBCTemplate(null);

    public List<?> query(){
        String sql = "select * from t_member";
        return JdbcTemplate.executeQuery(sql,new RowMapper<Member>(){
            @Override
            public Member mapRow(ResultSet rs, int rowNum) throws Exception {
                Member member = new Member();
                member.setUsername(rs.getString("username"));
                member.setPassword(rs.getString("password"));
                member.setAge(rs.getInt("age"));
                member.setAddr(rs.getString("addr"));
                return member;
            }
        },null);
    }



}
