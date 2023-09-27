package com.hspdeu.regexp;

public class Homework02 {
    public static void main(String[] args) {
        String content = "123";
        String regStr = "^[-+]?([1-9]\\d*|0)(\\.\\d+)?$";

        if (content.matches(regStr)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
