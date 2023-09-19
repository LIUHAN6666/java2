package com.hspdeu;

public class CpuNum {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        int Num = runtime.availableProcessors();
        System.out.println(Num);
    }
}
