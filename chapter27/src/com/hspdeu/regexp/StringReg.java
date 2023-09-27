package com.hspdeu.regexp;

import java.util.regex.Pattern;

public class StringReg {
    public static void main(String[] args) {


        String content = "jdk1.3,jdk1.4ffffffff";
        content = content.replaceAll("jdk1\\.3|jdk1\\.4", "jdk");
        System.out.println(content);

        String content1 = "13854545454";
        if (content1.matches("1(38|39)\\d{8}")) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        String content2 = "hello#abc-jack#12smith~北京";
        String[] split = content2.split("#|-|~|\\d+");
        for (String s :split) {
            System.out.println(s);

        }

    }
}
