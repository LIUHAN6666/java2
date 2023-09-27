package com.hspedu.jdbc.datasource;

import com.sun.jdi.connect.spi.Connection;

import java.sql.SQLException;
import java.util.List;

public class DBUtils_USE {
    public void testQueryMany() {
//        Connection connection = JDBCUtilsByDruid.getConnection();
//
//
//        QueryRunner queryRunner = new QueryRunner();
//        String sql = "select* from actor where id >=?";
//
//        List<Actor> list =
//                queryRunner.query(connection, sql, new BeanListHandler<>(Actor.class), 1);
//
//
//        for (Actor actor : list) {
//            System.out.println(actor);
//        }
//
//        JDBCUtilsByDruid.close(null,null,connection);
    }

    public void testQuerySingle() throws SQLException {
//        Connection connection = JDBCUtilsByDruid.getConnection();
//
//        QueryRunner queryRunner = new QueryRunner();
//
//        String sql = "select* from actor where id =?";
//
//        Actor actor = queryRunner.query(connection, sql, new BeanHandler<>(Actor.class), 4);
//        System.out.println(actor);
//    }
//     JDBCUtilsByDruid.close(null,null,connection);
    }


    public void testScalar() throws SQLException {
//        Connection connection = JDBCUtilsByDruid.getConnection();
//
//        QueryRunner queryRunner = new QueryRunner();
//
//        String sql = "select name from actor where id =?";
//
//        Object obj = queryRunner.query(connection, sql, new ScalarHandler(), 4);
//        System.out.println(obj);
//
//        JDBCUtilsByDruid.close(null, null, connection);
    }


    public void testDML() throws SQLException {
//        Connection connection = JDBCUtilsByDruid.getConnection();
//
//        QueryRunner queryRunner = new QueryRunner();
//
//        String sql = "update actor set name =? where id =?";
//        String sql = "insert into actor values(null,?,?,?)";
//        String sql = "delete from actor where id =?";
//
//       int affectedRow = queryRunner.query(connection, sql, 1233);
//
//        System.out.println(affectedRow);
//
//        JDBCUtilsByDruid.close(null, null, connection);
    }
}
