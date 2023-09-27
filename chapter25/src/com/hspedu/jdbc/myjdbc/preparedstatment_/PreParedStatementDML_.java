package com.hspedu.jdbc.myjdbc.preparedstatment_;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import java.util.Scanner;

public class PreParedStatementDML_ {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入");
        String admin_name =scanner.nextLine();
        System.out.println("请输入管理员密码");
        String admin_pwd =scanner.nextLine();




        Properties properties = new Properties();
        properties.load(new FileInputStream("src/mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String dirver = properties.getProperty("dirver");
        String url = properties.getProperty("url");
        Class.forName(dirver);
        Connection connection = DriverManager.getConnection(url, user, password);


      // String sql = "insert into admin values(?,?)";
      String sql = "update admin set pwd = ? where name =?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1,admin_pwd);
        preparedStatement.setString(2,admin_name);

        int rows = preparedStatement.executeUpdate();
        System.out.println(rows >0 ? "执行成功":"执行失败");


        preparedStatement.close();
        connection.close();

    }
}


