package com.abstract_;

public class AbstractExercise01 {
    public static void main(String[] args) {
        Manager jack = new Manager("jack", 99, 5000);
        jack.setBonus(20000);
        jack.work();
        CommomEmployee mary = new CommomEmployee("mary", 888, 200000);
        mary.work();
    }

}
