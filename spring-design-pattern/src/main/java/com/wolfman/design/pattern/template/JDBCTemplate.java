package com.wolfman.design.pattern.template;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCTemplate {

    private DataSource dataSource;

    //设置数据源
    public JDBCTemplate(DataSource dataSource){
        this.dataSource = dataSource;
    }

    //获得连接
    private Connection getConnection() throws SQLException {
        return this.dataSource.getConnection();
    }

    //创建语句集
    private PreparedStatement createPreparedStatement(Connection conn, String sql) throws  Exception{
        return  conn.prepareStatement(sql);
    }

    //执行语句集
    private ResultSet executeQuery(PreparedStatement pstmt, Object [] values) throws  Exception{
        for (int i = 0; i <values.length; i ++){
            pstmt.setObject(i,values[i]);
        }
        return  pstmt.executeQuery();
    }

    //关闭语句集
    private void closeStatement(Statement stmt) throws  Exception{
        stmt.close();
    }

    private void closeResultSet(ResultSet rs) throws  Exception{
        rs.close();
    }

    //关闭连接
    private void closeConnection(Connection conn) throws  Exception{
        //通常把它放到连接池回收
    }

    private List<?> parseResultSet(ResultSet rs,RowMapper rowMapper) throws  Exception{
        List<Object> result = new ArrayList<Object>();
        int rowNum = 1;
        while (rs.next()){
            result.add(rowMapper.mapRow(rs,rowNum ++));
        }
        return result;
    }


    public List<?> executeQuery(String sql,RowMapper<?> rowMapper,Object [] values){

        try {
            //1.获取连接
            Connection conn = getConnection();
            //2.创建语句集
            PreparedStatement pstmt = createPreparedStatement(conn,sql);
            //3.执行语句集，并且得到结果集
            ResultSet rs = this.executeQuery(pstmt,values);
            //4.解析语句集
            List<?> result = this.parseResultSet(rs,rowMapper);
            //5、关闭结果集
            this.closeResultSet(rs);
            //6、关闭语句集
            this.closeStatement(pstmt);
            //7、关闭连接
            this.closeConnection(conn);
            return result;


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }








}
