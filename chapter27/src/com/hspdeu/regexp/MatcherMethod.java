package com.hspdeu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherMethod {
    public static void main(String[] args) {
        String content = "hello edu jack tom hello smith hello ";

        String regStr = "hello";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()) {
            System.out.println("满足格式");
            System.out.println(matcher.start());
            System.out.println(matcher.end());
            System.out.println(content.substring(matcher.start(), matcher.end()));
        }


        String content1 = "hello edu jack hspedu tom hello hspedu smith hello ";
        String regStr1 = "hspedu";
        Pattern pattern1 = Pattern.compile(regStr1);
        Matcher matcher1 = pattern.matcher(content1);
        String s = matcher1.replaceAll("韩顺平教育");
        System.out.println(content1);
        System.out.println(s);


    }
}
