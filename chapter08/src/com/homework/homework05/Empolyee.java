package com.homework.homework05;

public class Empolyee {
    private String name;
    private double sal;
    private int salMon = 12;

    public Empolyee(String name, double sal) {
        this.name = name;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getSalMon() {
        return salMon;
    }

    public void setSalMon(int salMon) {
        this.salMon = salMon;
    }
    public void printsal(){
        System.out.println(name + "的年工资是:" + sal * salMon);
    }
}
