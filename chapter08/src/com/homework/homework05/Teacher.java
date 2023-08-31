package com.homework.homework05;

public class Teacher extends Empolyee {
    private int classDays;
    private double classSal;

    public Teacher(String name, double sal) {
        super(name, sal);
    }

    public int getClassDays() {
        return classDays;
    }

    public void setClassDays(int classDays) {
        this.classDays = classDays;
    }

    public double getClassSal() {
        return classSal;
    }

    public void setClassSal(double classSal) {
        this.classSal = classSal;
    }

    @Override
    public void printsal() {
        System.out.print("老师");
        System.out.println(getName() + "年工资是：" +
                (getSal() * getSalMon() + classDays * classSal));
    }
}
