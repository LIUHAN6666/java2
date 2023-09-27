package com.hspedu.jdbc.datasource;

import java.io.FileInputStream;
import java.util.Properties;

public class C3P0_ {
    public void testC3P0_01() throws Exception{
//        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
//        Properties properties = new Properties();
//        properties.load(new FileInputStream("src/mysql.properties"));
//        String user = properties.getProperty("user");
//        String password = properties.getProperty("password");
//        String url = properties.getProperty("url");
//        String driver = properties.getProperty("driver");

//        comboPooledDataSource.setDriverClass(driver);
//        comboPooledDataSource.setJdbcUrl(url);
//        comboPooledDataSource.setUser(user);
//        comboPooledDataSource.setPassword(password);

//        comboPooledDataSource.setInitialPoolSize(10);
//        comboPooledDataSource.setMaxPoolSize(50);

        for (int i = 0; i < 5000; i++) {
//        Connection connection = comboPooledDataSource.getConnection()
//        connection.close
        }
    }
}
