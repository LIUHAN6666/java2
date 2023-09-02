package com.InnerClass;

public class InnerClassExercise {
    public static void main(String[] args) {
        f1(new IL() {
            @Override
            public void show() {
                System.out.println("picter");
            }
        });
    }
    public static void f1(IL il) {
        il.show();
    }


}
interface IL {
    void show();
}
