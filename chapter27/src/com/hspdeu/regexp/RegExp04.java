package com.hspdeu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp04 {
    public static void main(String[] args) {
        String content = "djfjkasjfkahfahfjkhafha";
        String regStr = "han[韩]寒" ;
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);

        while ((matcher.find())){
            System.out.println(matcher.group(0));
        }
    }
}
