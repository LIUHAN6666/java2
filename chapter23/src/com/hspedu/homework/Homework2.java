package com.hspedu.homework;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Homework2 {
    private static Constructor<?> declaredConstructors;

    public static void main(String[] args) throws Exception {


        Class<?> aClass = Class.forName("java.io.File");
        Constructor<?>[] constructors = aClass.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor(String.class);
        String fileAllPath = "e:\\mynew.txt";
        Object o = declaredConstructor.newInstance(fileAllPath);

        Method createNewFile = aClass.getMethod("createNewFile");
        createNewFile.invoke(o);


        System.out.println(fileAllPath.getClass());

    }
}
