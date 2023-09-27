package com.hspdeu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp10 {
    public static void main(String[] args) {
        String content = "https://www.bilibili.com/video/BV1fh411y7R8/?p=894&spm_id_from=pageDriver&vd_source=a1ac6477fbdce72f6de955ef10fb01b5";


        String regStr = "^((http|https)://)([\\w-]+\\.)+[\\w-]+(\\/[\\w-?=&/%.#]*)?$";



        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);

        if (matcher.find()) {
            System.out.println("满足格式");
        } else {
            System.out.println("不满足格式");
        }
    }
}
