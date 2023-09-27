package com.hspedu.jdbc.myjdbc.preparedstatment_;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class PreParedStatement_ {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入管理员名字");
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


        String sql ="select name,pwd from where name =? and pwd = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1,admin_name);
        preparedStatement.setString(2,admin_pwd);

        ResultSet resultSet = preparedStatement.executeQuery();
        if(resultSet.next()){
            System.out.println("恭喜登陆成功");
        } else {
            System.out.println("shibai");
        }

        resultSet.close();
        preparedStatement.close();
        connection.close();

    }
}


