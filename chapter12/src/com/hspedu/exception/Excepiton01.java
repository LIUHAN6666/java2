package com.hspedu.exception;

public class Excepiton01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        try {
            int res = num1 / num2;
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("程序继续运行");

    }
}
