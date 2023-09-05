package com.hspdeu.annotation;

public class Override {
    public static void main(String[] args) {

    }
}
class Father {
    public void fly() {
        System.out.println("Father...fiy");
    }
}
class Son extends  Father {
    @java.lang.Override
    public void fly() {
        System.out.println("son ....fly");
    }
}
