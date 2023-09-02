package com.codeblock;

public class CodeBlockDetail04 {
    public static void main(String[] args) {
        //先类加载  父---子
        //创建对象  子构造器
        new B4();
    }
}

class A4 {
    private static int n1 = getN1();

    static {
        System.out.println("A4的第一个静态代码块");//2
    }

    {
        System.out.println("A4的第一个普通代码块");//5
    }

    public int n2 = getN2();

    public static int getN1() {
        System.out.println("getN1");// 1
        return 10;
    }

    public int getN2() {
        System.out.println("getN2");//6
        return 20;
    }

    public A4() {
        System.out.println("A4的构造器");//7
    }
}
class C02 {
    private int n1 = 100;
    private static int n2 = 200;
    private void m1 (){

    }
    private static void m2(){

    }

    static {
        //System.out.println(n1);
        System.out.println(n2);
        //m1();
        m2();
    }
    {
        System.out.println(n1);
        System.out.println(n2);
        m1();
        m2();
    }
}
class B4 extends A4 {
    private static int n3 = getN3();

    static {
        System.out.println("B4的第一个静态代码块");//4
    }

    {
        System.out.println("B4的第一个普通代码块");//8
    }

    public int n4 = getN4();

    public static int getN3() {
        System.out.println("getN3");//3
        return 30;
    }

    public int getN4() {
        System.out.println("getN4");//9
        return 40;
    }

    public B4() {//super（）  普通代码 普通属性初始化
        System.out.println("B4的构造器");//10
    }
}
