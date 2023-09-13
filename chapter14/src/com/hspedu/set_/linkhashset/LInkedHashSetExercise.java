package com.hspedu.set_.linkhashset;

import java.util.LinkedHashSet;
import java.util.Objects;

public class LInkedHashSetExercise {
    public static void main(String[] args) {
        LinkedHashSet set = new LinkedHashSet();
        set.add(new Car("奥拓",1000));
        set.add(new Car("奥迪",300000));
        set.add(new Car("法拉利",100000000));
        set.add(new Car("奥迪",300000));
        set.add(new Car("保时捷",700000));
        set.add(new Car("奥迪",300000));
        System.out.println(set);
    }
}
class Car {
    private String name;
    private  double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}