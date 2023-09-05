package com.hspdeu.enum_;

public class EnumExercise {
    public static void main(String[] args) {
        Week[] weeks = Week.values();
        for (Week week : weeks) {
            System.out.println(week);
        }
    }
}
enum Week {
    MONDEY("周一"),
    TUESDAY("周二");

    private String name;

    Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
