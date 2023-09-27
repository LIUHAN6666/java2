package com.hspdeu.regexp;

public class Homework01 {
    public static void main(String[] args) {
        String content = "hsp@shu@.com";
        String regStr = "^[\\w-]+@([a-zA-Z]+\\.)+[a-zA-Z]+$";

        if (content.matches(regStr)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
