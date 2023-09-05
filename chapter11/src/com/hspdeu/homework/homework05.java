package com.hspdeu.homework;

public class homework05 {
    public static void main(String[] args) {
        new A().f1();
    }
}
class A {
    private String name = "hello";
    public void f1() {
        class B {
            private final String  name = "hanshunping";
            public void show (){
                System.out.println(name);
                System.out.println(A.this.name);
            }
        }
        B b = new B();
        b.show();
    }
}
