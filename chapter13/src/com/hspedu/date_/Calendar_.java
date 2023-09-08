package com.hspedu.date_;

import java.util.Calendar;

public class Calendar_ {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c);
        System.out.println( c.get(Calendar.YEAR) + "年");
        System.out.println( c.get(Calendar.MONTH) + 1 + "月");
        System.out.println(c.get(Calendar.DAY_OF_MONTH) + "日");
        System.out.println(c.get(Calendar.HOUR) + "小时");
        System.out.println( c.get(Calendar.MINUTE) + "分钟");
        System.out.println(c.get(Calendar.SECOND) + "秒");

        System.out.println(c.get(Calendar.YEAR) + "年" +
                (c.get(Calendar.MONTH) + 1) + "月" +
                c.get(Calendar.DAY_OF_MONTH) + "日" +
                c.get(Calendar.HOUR) + "日" +
                c.get(Calendar.MINUTE) + "分钟" +
                c.get(Calendar.SECOND) + "秒");



    }
}
