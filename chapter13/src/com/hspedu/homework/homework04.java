package com.hspedu.homework;

public class homework04 {
    public static void main(String[] args) {
        String str = "jfdkaSJ$$$&&&NHSJ3242ASN";
        countStr(str);
    }

    public static void countStr(String str) {
        if (str == null) {
            System.out.println("不能为空");
            return;
        }
        int num = 0;
        int low = 0;
        int upper = 0;
        int other = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                num++;
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                low++;
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                upper++;
            } else {
                other++;
            }
        }
        System.out.println(num);
        System.out.println(low);
        System.out.println(upper);
        System.out.println(other);
    }
}
