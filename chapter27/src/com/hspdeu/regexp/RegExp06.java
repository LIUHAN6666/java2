package com.hspdeu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp06 {
    public static void main(String[] args) {

        String content = "123abc";
       // String regStr = "^[0-9]+[a-z]*";  1个数字开头，后面任意小写字母
       String regStr = "^[0-9]+[a-z]+$";  //1个数字开头，以至少1个小写字母结尾
       // han//b 以han结尾
        //han//B 以han开头

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);

        while ((matcher.find())){
            System.out.println(matcher.group(0));
        }
    }
}
