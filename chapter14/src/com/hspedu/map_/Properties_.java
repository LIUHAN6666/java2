package com.hspedu.map_;

import java.util.Properties;

public class Properties_ {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.put("john",100);
        properties.put("lucy",100);
        properties.put("lic",100);
        properties.put("lic",88);
        System.out.println(properties);

        System.out.println(properties.get("lic"));

        properties.remove("lic");
        System.out.println(properties);

        properties.put("john", "约翰");
        System.out.println(properties);
    }
}
