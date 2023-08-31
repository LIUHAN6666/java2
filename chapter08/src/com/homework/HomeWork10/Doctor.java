package com.homework.HomeWork10;

public class Doctor {
    private String name;
    private int age;
    private String job;
    private char grender;
    private double sal;

    public Doctor(String name, int age, String job, char grender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.grender = grender;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public char getGrender() {
        return grender;
    }

    public void setGrender(char grender) {
        this.grender = grender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
         if (!(obj instanceof Doctor)) {
            return false;
         }
        Doctor doctor = (Doctor)obj;
         return this.name.equals(doctor.name) && this.age == doctor.age &&
                 this.grender == doctor.grender && this.job.equals(doctor.job) &&
                 this.sal == doctor.sal;
    }
}
