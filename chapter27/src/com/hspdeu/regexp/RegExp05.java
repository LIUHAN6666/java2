package com.hspdeu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp05 {
    public static void main(String[] args) {
        String content = "djfjkasjfkahfahfjkhafha";
        //String regStr = "a{3}";  aaa
        //String regStr = "\\d{2}";  两位任意
       // String regStr = "a{3,4}"; aaa,aaaa
       // String regStr = "1+";  1或多个1
       // String regStr = "1*";  0个1或多个1
        String regStr = "a1？"; //a 或者 a1
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);

        while ((matcher.find())){
            System.out.println(matcher.group(0));
        }
    }
}
