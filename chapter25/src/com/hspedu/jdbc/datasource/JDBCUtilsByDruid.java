package com.hspedu.jdbc.datasource;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Properties;

public class JDBCUtilsByDruid {
//    private static DateSource ds;
//    static {
//        Properties properties = new Properties();
//        try {
//            properties.load(new FileInputStream("src/druid.properties"));
//            ds = DruidDataSourceFactory.createDataSource(properties);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static Connection getConnection() throws Exception{
//        return ds.getConnection();
//    }
//
//    public static void close(ResultSet resultSet, Statement statement, Connection connection){
//        try {
//            if (resultSet != null){
//                resultSet.close();
//            }
//            if (statement != null){
//               statement.close();
//            }
//            if (connection != null){
//                connection.close();
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//    }
}
