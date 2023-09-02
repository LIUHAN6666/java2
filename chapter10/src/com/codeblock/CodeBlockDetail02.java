package com.codeblock;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        A a = new A();
    }
}
class A {
    private int n2 = getN2();
    {
        System.out.println("A普通代码块01");//第四
    }
    private static int n1 = getN1();

    static {//静态代码块
        System.out.println("A静态代码块01");//第二
    }

    public static int getN1() {//静态属性初始化
        System.out.println("getN1被调用");//第一
        return 100;
    }

    public int getN2() {//普通属性
        System.out.println("getN2被调用");//第三
        return 100;
    }
    public A (){
        System.out.println("构造器被调用");//最后
    }
}