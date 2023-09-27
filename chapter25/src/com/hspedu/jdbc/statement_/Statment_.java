package com.hspedu.jdbc.statement_;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class Statment_ {
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

        Statement statement = connection.createStatement();
        String sql ="select id,name,pwd from where name ='"
                + admin_name + "' and pwd = '" + admin_pwd + "'";
        ResultSet resultSet = statement.executeQuery(sql);
        if(resultSet.next()){
            System.out.println("恭喜登陆成功");
        } else {
            System.out.println("shibai");
        }

        resultSet.close();
        statement.close();
        connection.close();

    }
}
