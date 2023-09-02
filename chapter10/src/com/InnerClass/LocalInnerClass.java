package com.InnerClass;

public class LocalInnerClass {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.m1();
    }
}
class Outer02 {
    private int  n1 = 100;
    private void m2(){
        System.out.println("outer02");
    }
    public void m1(){
        class Inner02{
            private int n1 = 300;
            public void f1(){
                //直接访问
                System.out.println( Outer02.this.n1);
                m2();
            }
        }//创建，调用
        Inner02 inner02 = new Inner02();
        inner02.f1();
    }
}
