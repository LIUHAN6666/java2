package com.main;

public class Main01 {
    private static String name = "韩顺平教育";
    private int n1 = 100000;
    public void cry(){
        System.out.println("非静态方法");
    }

     public static void hi(){
    System.out.println("main01");
}
    public static void main(String[] args) {
        System.out.println(name);
        hi();
        Main01 main01 = new Main01();
        System.out.println(main01.n1);
        main01.cry();
    }
}
