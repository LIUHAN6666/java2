package com.hspdeu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexP_ {
    public static void main(String[] args) {
        String s = "djfjkasjfkahfahfjkhafha";

        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(s);

        while ((matcher.find())){
            System.out.println(matcher.group(0));
        }


    }
}
