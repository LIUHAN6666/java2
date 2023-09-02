package com.InnerClass;

public class StaticInnerClass {
    public static void main(String[] args) {
        Outer10 outer10 = new Outer10();
        outer10.m1();
        Outer10.Inner10 inner10 = new Outer10.Inner10();
        inner10.say();
        Outer10.Inner10 inner01 = outer10.getInner10();
        System.out.println("=========");
        inner10.say();
    }
}
class Outer10 {
    private int n1 = 10;
    public static String name = "订真";
static class Inner10{
    private static  String name = "韩顺平教育";
    public void say(){

        System.out.println(name + " " + Outer10.name);
    }
}
public void m1 (){
    Inner10 inner10 = new Inner10();
    inner10.say();
}
public Inner10 getInner10(){
    return new Inner10();
}
}

