package com.hspedu.jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDbc1 {

    public void connect02() throws Exception{
        Class<?> aClass = Class.forName("com.mysql.jbdc.Driver");
        Driver driver =(Driver) aClass.newInstance();
        String url = "jdbc:mysql://localhost:3306/hsp_02";
        Properties properties = new Properties();
        properties.setProperty("user","root");
        properties.setProperty("password","hsp");
        Connection connect = driver.connect(url, properties);
    }


    public void connect03() throws Exception{
        Class<?> aClass = Class.forName("com.mysql.jbdc.Driver");
        Driver driver =(Driver) aClass.newInstance();
        String url = "jdbc:mysql://localhost:3306/hsp_02";
        String user = "root";
        String password = "hsp";
        DriverManager.registerDriver(driver);
        Connection connection = DriverManager.getConnection(url, user, password);
    }

    public void connect04() throws Exception{
        Class.forName("com.mysql.jbdc.Driver");
        String url = "jdbc:mysql://localhost:3306/hsp_02";
        String user = "root";
        String password = "hsp";
        Connection connection = DriverManager.getConnection(url, user, password);
    }

    public void connect05() throws Exception{
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\mysql.properties"));
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String dirver = properties.getProperty("dirver");
        String url = properties.getProperty("url");
        Class.forName(dirver);
        Connection connection = DriverManager.getConnection(url, user, password);
    }
}


