package com.hspdeu.homework;

public class honework07 {
    public static void main(String[] args) {
        Car_ car_ = new Car_(60);
        car_.getAir().flow();

        Car_ car_1 = new Car_(-4);
        car_1.getAir().flow();

        Car_ car_2 = new Car_(20);
        car_2.getAir().flow();
    }
}
class Car_{
    private double temperature;

    public Car_(double temperature) {
        this.temperature = temperature;
    }

    class Air {
        public void flow() {
            if (temperature > 40) {
                System.out.println("大于40吹冷气");
            } else if (temperature < 0) {
                System.out.println("小于0吹暖气");
            } else {
                System.out.println("关闭");
            }
        }

    }
    public  Air getAir (){
        return new Air();
    }
}
