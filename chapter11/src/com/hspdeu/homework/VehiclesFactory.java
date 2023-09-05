package com.hspdeu.homework;

public class VehiclesFactory {
    private VehiclesFactory(){}
    private static Horse horse = new Horse();
    public static Horse getHorse(){
        return horse;
    }
    public static Boat getBoat (){
        return new Boat();
    }
    public static PLane getPlane(){
        return new PLane();
    }
}
