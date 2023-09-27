package com.hspedu.properties;

import java.io.FileReader;
import java.util.Properties;

public class Properties02 {
    public static void main(String[] args) throws Exception{
        Properties properties = new Properties();
        properties.load(new FileReader("src\\mysql.properties"));
        properties.list(System.out);
        String user = properties.getProperty("user");
        String pwd = properties.getProperty("pwd");
        System.out.println(user);
        System.out.println(pwd);
    }
}

