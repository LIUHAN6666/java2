package com.homework.homework15;

public class Homework15 {
    public static void main(String[] args) {
        AAA obj = new BBB();
        System.out.println("obj的运行类型为" + obj.getClass());
        obj = new CCC();
        System.out.println("obj的运行类型为" + obj.getClass());

    }
}

class AAA {
}

class BBB extends AAA {
}

class CCC extends BBB{
}
