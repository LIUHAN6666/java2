package com.hspedu.reflection.question;

import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectionQuestion {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String method = properties.get("method").toString();
        System.out.println(classfullpath);
        System.out.println(method);
        Class cls = Class.forName(classfullpath);
        Object o = (cls).newInstance();

        Method method1 = cls.getMethod(method);
        method1.invoke(o);


    }
}
