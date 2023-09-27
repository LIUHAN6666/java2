package com.hspedu.reflection;

import java.lang.reflect.Method;

public class Reflection02 {
    public static void main(String[] args) throws Exception{
        m1();
        m2();
    }

    public static void m1() {
        Cat cat = new Cat();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 9000000; i++) {
            cat.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void m2() throws Exception {
        Class cls = Class.forName("com.hspedu.reflection.Cat");
        Object o = cls.newInstance();
        Method hi = cls.getMethod("hi");
        hi.setAccessible(true);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 9000000; i++) {
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
