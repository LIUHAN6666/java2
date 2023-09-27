package com.hspedu.dao_.dao;

import com.hspedu.jdbc.datasource.JDBCUtilsByDruid;

import java.sql.Connection;
import java.util.List;

public class BasicDAO<T> {
//    private QueryRunner qr = new QueryRunner();
//
//    public int update(String sql, object... parameters) {
//        Connection connection = mull;
//
//        try {
//            connection = JDBCUtilsByDruid.getConnection();
//            int update = qr.update(connection, sql, parameters);
//            return update;
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        } finally {
//            JDBCUtilsByDruid.close(null, null, connection);
//        }
//    }
//
//
//    public List<T> queryMulti(String sql,Class<T> clazz,Object... parameters){
//
//        Connection connection = null;
//        try {
//            connection = JDBCUtilsByDruid.getConnection();
//       return qr.query(connection,sql,new BeanListHandler<T>(clazz),parameters)
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        } finally {
//            JDBCUtilsByDruid.close(null, null, connection);
//        }
//    }
}
