package com.hspedu.reflection.class_;

public class GetClass {
    public static void main(String[] args) throws Exception{

        String classALLPath = "com.hspedu.Car";
        Class cls = Class.forName(classALLPath);

      // Class cls2 = Car.class;
       // System.out.println(cls2);

       // Car car = new Car();
       // Class cls3 = car.getClass;
        //System.out.println(cls3);

       // ClassLoader classLoader = car.getClass().getClassLOader();
      //  Class cls4 = classLoader.loadClass(classALLPath);
       // System.out.println(cls4);

    }
}
