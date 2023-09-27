package com.hspdeu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp12 {
    public static void main(String[] args) {


        String content = "我......我要....学....学....学....java";
        Pattern pattern = Pattern.compile("\\.");
        Matcher matcher = pattern.matcher(content);

        content = matcher.replaceAll("");


        pattern = Pattern.compile("(.)\\1+");
        matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println(matcher.group(0));
        }

        content = matcher.replaceAll("$1");
        System.out.println(content);


        content = Pattern.compile("(.)\\1+").matcher(content).replaceAll("$1");
        System.out.println(content);
    }
}
