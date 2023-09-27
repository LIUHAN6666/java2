package com.hspedu.object;

import java.io.*;
import com.hspedu.object.Dog;
public class ObjectInputStream01 {
    public static void main(String[] args) throws Exception {

        ObjectInputStream ois = null;
        String filePath = "e\\data.dat";
        ois = new ObjectInputStream(new FileInputStream(filePath));

        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());
        Object dog = ois.readObject();
        System.out.println(dog.getClass());
        System.out.println(dog);
        Dog dog2 = (Dog) dog;
        System.out.println(dog2.getName());
        ois.close();




    }
}

