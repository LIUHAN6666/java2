package com.homework.homework04;

public class manager extends Employee{
    private double bonus;

    public manager(String name, double daySal, int workdays, double grade) {
        super(name, daySal, workdays, grade);
    }

    @Override
    public void printSal() {
        System.out.println("经理" + getName() + "工资是:"
        + (bonus + getDaySal() * getWorkdays() * getGrade()));
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
