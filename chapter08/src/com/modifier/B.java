package com.modifier;

public class B {
    public void say() {
        A a = new A();
        System.out.println("n1=" + a.n1);
        System.out.println("n2=" + a.n2);
        System.out.println("n3=" + a.n3);
        a.m1();
        a.m2();
        a.m3();
       // a.m4();// miss
       // System.out.println("n4=" + a.n4);  私有不能访问
    }
}
