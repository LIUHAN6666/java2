package com.homework.homework05;

public class Scientist extends Empolyee {
    private double bonus;

    public Scientist(String name, double sal) {
        super(name, sal);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printsal() {
        System.out.print("科学家");
        System.out.println(getName() + "年工资是：" +
                (getSal() * getSalMon() + bonus));
    }
}
