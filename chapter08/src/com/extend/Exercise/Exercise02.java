package com.extend.Exercise;

public class Exercise02 {
    public static void main(String[] args) {
        C c = new C();

    }
}
class A0 {
    public A0 () {
        System.out.println("我是A类");
    }
}
class B0 extends A0 {
    public B0() {
        System.out.println("我是b类无参构造");
    }
     public B0(String name) {
            System.out.println("我是b类有参构造");
        }
    }
class C extends B0 {
    public C() {
        this("hello");
        System.out.println("我是c类无参构造");
    }
          public C(String name) {
              super ("hahaha");
            System.out.println("我是c类有参构造");
    }
}

