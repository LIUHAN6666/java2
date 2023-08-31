package com.Override;

public class Student extends Person {
    private double score;
    private int ID;

    public Student(String name, int age, double score, int ID) {
        super(name, age);
        this.score = score;
        this.ID = ID;
    }
    public String say() {
        return super.say() + "ID=" + ID + "score=" + score;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
