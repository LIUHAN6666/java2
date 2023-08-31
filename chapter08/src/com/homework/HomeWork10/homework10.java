package com.homework.HomeWork10;

public class homework10 {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("jack",20, "医者", '男', 20000);
        Doctor doctor2 = new Doctor("jack",10, "医者", '男', 20000);
        System.out.println(doctor1.equals(doctor2));
    }
}
