package com.interface_;

public class InterFace01 {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Camera camera = new Camera();
        Computer computer = new Computer();
        computer.work(phone);
        System.out.println("=================");
        computer.work(camera);
    }
}