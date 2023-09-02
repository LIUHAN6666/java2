package com.codeblock;

public class CodeBlockDetail03 {
    public static void main(String[] args) {
        new BBB();
    }
}
class AAA{
    {
        System.out.println("AAA普通代码块被调用");//1
    }
public AAA(){
    //1.super()
    //2.调用本类普通代码块
    System.out.println("AAA构造器被调用");//2
}
}
class BBB extends AAA{
    {
        System.out.println("BBB普通代码块");//3
    }
public BBB(){
        //1.super()
    //2.调用本类普通代码块
    System.out.println("BBB构造器被调用");//4
}
}
