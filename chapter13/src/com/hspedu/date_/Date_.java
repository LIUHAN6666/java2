package com.hspedu.date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_ {
    public static void main(String[] args) throws ParseException {
        Date d1 = new Date();
        System.out.println(d1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日hh:mm:ss E");
        String format = sdf.format(d1);
        System.out.println(format);

        Date d2 = new Date(488375982);
        System.out.println(d2);
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日hh:mm:ss E");
        String format1 = sdf.format(d2);
        System.out.println(format1);

        String s = "1996年01月01日 10:20:30 星期一";
        Date parse = sdf.parse(s);
        System.out.println(sdf.format(parse));

    }
}
