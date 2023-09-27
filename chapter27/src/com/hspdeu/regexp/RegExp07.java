package com.hspdeu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp07 {
    public static void main(String[] args) {
        String content = "s7789";
        //String regStr = "(\\d\\d)(\\d\\d)";
        String regStr = "(?<g1>\\d\\d)(?<g2>\\d\\d)";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);

        while ((matcher.find())){
            System.out.println(matcher.group(0));
            System.out.println(matcher.group(1));
           // System.out.println(matcher.group("g1"));
            System.out.println(matcher.group(2));
        }
    }
}


