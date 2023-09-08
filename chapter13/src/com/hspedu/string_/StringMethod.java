package com.hspedu.string_;

public class StringMethod {
    public static void main(String[] args) {
        String s = "hELlo";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        String s1 = "宝玉";
        s1 = s1.concat("黛玉").concat("黛玉").concat("熙凤");
        System.out.println(s1);

       String s2 =  "宝玉 黛玉 黛玉 熙凤";
        s2 = s2.replace("黛玉","宝玉");
        System.out.println(s2);

        String poem = "菜,徐,坤";
        String[] split = poem.split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }

        String q = "dksksjfjsj";
        char[] chr = q.toCharArray();
        for (int i = 0; i < chr.length; i++) {
            System.out.println(chr[i]);
        }

        String w1 = "hello";
        String w2 = "heww";
        System.out.println(w1.compareTo(w2));

        String n1 = "丁真";
        int age = 10;
        double score = 98.3 / 3;
        char gender = '男';
        String info = "我的姓名是：" + n1 + "， 年龄是：" + age + "， 成绩是："
                + score + "， 性别是：" + gender;
        System.out.println(info);
        String f1= "名字是%s 年龄是%d 成绩是%.2f 性别是%c";
        String info1 = String.format(f1,n1,age,score,gender);
        System.out.println(info1);
    }
}
