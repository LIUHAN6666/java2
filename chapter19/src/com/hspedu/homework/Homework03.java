package com.hspedu.homework;

import java.io.*;
import java.util.Properties;

public class Homework03 {
    public static void main(String[] args) throws Exception{
        String filePath = "src\\dog.properties";

        Properties properties = new Properties();
        properties.load(new FileReader(filePath));
        properties.list(System.out);

        String name = properties.get("name") + "";
        int age = Integer.parseInt(properties.get("age") + "");

        String color = properties.get("color") + "";

        Dog dog = new Dog(name,age,color);
        System.out.println(dog);


        String serFilePath = "e:\\dog.dat";
        ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(serFilePath));
        stream.writeObject(dog);
        stream.close();

    }
    public void m1()throws Exception{
        String serFilePath = "e:\\dog.dat";
        ObjectInputStream ois = null;
                ois = new ObjectInputStream(new FileInputStream(serFilePath));

              Dog dog =(Dog)ois.readObject();
        System.out.println(dog);
        ois.close();
    }

}
class Dog implements Serializable {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
}
