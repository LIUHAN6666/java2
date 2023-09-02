package com.codeblock;

public class CodeBlockDetail01 {
    public static void main(String[] args) {
       // AA aa = new AA();
        //AA aa1 = new AA();
        System.out.println(Cat.n1);
    }
}
class  Cat {
    public static int n1 = 999;
    static {
        System.out.println("Cat静态代码cat已被执行");
    }
}
class BB {
    static {
        System.out.println("BB静态代码b已被执行");
    }
}
class AA extends BB{
    static {
        System.out.println("AA静态代码a被执行");
    }
}
