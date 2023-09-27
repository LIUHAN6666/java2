package com.hspedu.reflection.question;

import java.lang.reflect.Constructor;

public class ReflectCreateinstance {
    public static void main(String[] args) throws Exception{
        Class<?> aClass = Class.forName("com.hspedu.reflection.question.User");
        Object o = aClass.newInstance();
        System.out.println(o);

        Constructor<?> constructor = aClass.getConstructor(String.class);
        Object o1 = constructor.newInstance("hsp");
        System.out.println(o1);

        Constructor<?> constructor1 = aClass.getDeclaredConstructor(int.class, String.class);
        constructor1.setAccessible(true);
        Object o2 = constructor1.newInstance(100, "cherry");
        System.out.println(o2);
    }
}

class User {
    private int age = 10;
    private String name = "marry";

    public User() {
    }

    private User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}


