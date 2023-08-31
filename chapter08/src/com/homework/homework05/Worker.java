package com.homework.homework05;

public class Worker extends Empolyee{
    public Worker(String name, double sal) {
        super(name, sal);
    }

    @Override
    public void printsal() {
        System.out.print("工人");
        super.printsal();
    }
}
