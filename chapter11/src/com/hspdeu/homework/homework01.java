package com.hspdeu.homework;

public class homework01 {
    public static void main(String[] args) {
        Car c = new Car();
        Car car1 = new Car(100);
        System.out.println(c);
        System.out.println(car1);

    }
}
class Car {
    double price = 10;
    static String color = "white";
    public Car() {
        this.price = 9;
        this.color = "red";
    }

    public Car(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return price + " " + color;
    }
}
