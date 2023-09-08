package com.hspedu.string_;

public class StringUMl {
    public static void main(String[] args) {
        String str = "hello";
        String str1 = "hello";
        System.out.println(str1.equals(str));

        String str2 = "hello";
        String str3 = "heLlo";
        System.out.println(str2.equalsIgnoreCase(str3));

        System.out.println(str3.length());

        String s = "dajdkjkjs";
        int index = s.indexOf('j');
        System.out.println(index);

        int lastindex = s.lastIndexOf('d');
        System.out.println(lastindex);

        String s2 = "王源🕸王俊凯";
       // System.out.println(s2.substring(5));
        System.out.println(s2.substring(1,5));

    }
}
