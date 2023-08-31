package com.homework.homework05;

public class Peasant extends Empolyee{
    public Peasant(String name, double sal) {
        super(name, sal);
    }

    @Override
    public void printsal() {
        System.out.print("农民");
        super.printsal();
    }
}
