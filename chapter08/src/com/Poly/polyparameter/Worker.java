package com.Poly.polyparameter;

public class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }
    public void work() {
        System.out.println("工人" + getName() + "正在工作");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
