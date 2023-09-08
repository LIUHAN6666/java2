package com.hspedu.date_;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDate_ {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        DateTimeFormatter of = DateTimeFormatter.ofPattern("yyyy年MM月dd日HH小时mm分ss秒");
        String format = of.format(ldt);
        System.out.println(format);


        System.out.println(ldt.getYear() + "年");
        System.out.println(ldt.getMonthValue() + "月");
        System.out.println(ldt.getMonth() + "月");
        System.out.println(ldt.getDayOfMonth() + "日");
        System.out.println(ldt.getHour() + "时");
        System.out.println(ldt.getMinute() + "分");
        System.out.println(ldt.getSecond() + "秒");

        LocalDateTime localDateTime = ldt.plusDays(30);
        System.out.println(of.format(localDateTime));

        LocalDateTime time = ldt.minusMinutes(10);
        System.out.println(of.format(time));


    }
}
