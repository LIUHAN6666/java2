package com.InnerClass;

public class InnerClassExercise01 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("qichangle");
            }
        });
        cellphone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("xksjkfjsj");
            }

        });
    }
}
interface Bell {
    void ring();
}
class Cellphone {
    public void alarmClock(Bell bell) {
        bell.ring();
    }

}