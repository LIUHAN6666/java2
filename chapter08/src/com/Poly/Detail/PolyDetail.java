package com.Poly.Detail;

public class PolyDetail {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();
        animal.run();
        animal.show();
        animal.sleep();
        Cat cat = (Cat) animal;
        cat.catchMouse();
        System.out.println("0k-----");
    }

}
