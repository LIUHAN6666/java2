package com.hspdeu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegTheory {
    public static void main(String[] args) {
        String content ="dhkhsahfkah4637jkdhdgjkh64673kjhdgkh7777";

        String regStr ="\\d\\d\\d\\d";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);


        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
