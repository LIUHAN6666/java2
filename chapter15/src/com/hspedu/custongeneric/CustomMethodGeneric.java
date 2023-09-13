package com.hspedu.custongeneric;

public class CustomMethodGeneric {
    public static void main(String[] args) {
        Car car = new Car();
        car.fly("奔驰",400000);
    }
}
class Car{
    public void run(){
    }
    public <T,R>void fly(T t,R r) {
    }

}
class fish<T,R> {
    public void hi(T t) {}
}