package com.hspdeu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEcpo03 {
    public static void main(String[] args) {
        String content ="dhkhsahfkah4637jkdhdgjkh64673kjhdgkh7777";

        String regStr ="[^0-9]";
       // String regStr ="[0-9]";
       // String regStr ="(?i)abc";

        Pattern pattern = Pattern.compile(regStr,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(content);


        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

