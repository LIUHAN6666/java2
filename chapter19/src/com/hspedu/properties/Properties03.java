package com.hspedu.properties;

import java.io.FileOutputStream;
import java.util.Properties;

public class Properties03 {
    public static void main(String[] args) throws Exception{
        Properties properties = new Properties();


        properties.setProperty("charset","utf8");
        properties.setProperty("user","Tom");
        properties.setProperty("pwd","abc111");


        properties.store(new FileOutputStream("src\\mysql1.propreties"),null);
        System.out.println("chenggong");
    }
}
