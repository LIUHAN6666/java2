package com.hspdeu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp11 {
    public static void main(String[] args) {
        String content = "hello 44444jack tom1111 jack22 12311-333444666 xxx yyy";

        //String regStr = "(\\d)\\1";
       // String regStr = "(\\d)\\1{4}";
       // String regStr = "(\\d)(\\d)\\2\\1";
        String regStr = "\\d{5}-(\\d)\\1{2}(\\d)\\2{2}(\\d)\\3{2}";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);

        while (matcher.find()){
            System.out.println(matcher.group(0));
        }

    }
}
