package com.hspedu.stringbuilder_;

public class StringANDStringBufferANDStringBuilder {
    public static void main(String[] args) {
       // String test = " ";
        long startTime = 0l;
        long endTime = 0l;
        StringBuffer buffer = new StringBuffer("");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 80000; i++) {
            buffer.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuffer的时间：" + (endTime - startTime));


        StringBuilder builder = new StringBuilder("");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 80000; i++) {
            builder.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("StringBuilder的时间：" + (endTime - startTime));


        String test = "";
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 80000; i++) {
            test = test +i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("String的时间" + (endTime - startTime));

    }
}
