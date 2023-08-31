package com.pkg;
import com.modifier.A;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("n1=" + a.n1);
       // System.out.println("n2=" + a.n2);//无法访问
       // System.out.println("n3=" + a.n3);//无法访问
        a.m1();//只能用public
    }
}
