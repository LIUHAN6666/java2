package com.hspdeu.enum_;

public class EnumMethod {
    public static void main(String[] args) {

        Season1 autumn = Season1.AUTUMN;
        System.out.println(autumn.name());
        System.out.println(autumn.ordinal());
        Season1[] values = Season1.values();
        for (Season1 season1: values) {
            System.out.println(season1);
        }
            System.out.println(Season1.SPRING.compareTo(Season1.AUTUMN));
        }
    }

