package com.hspedu.object;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectOutStream01 {
    public static void main(String[] args) throws IOException {

        String filePath = "e:\\data.txt";
        ObjectOutputStream oos = null;
        oos = new ObjectOutputStream(new FileOutputStream(filePath));

        oos.writeInt(100);
        oos.writeBoolean(true);
        oos.writeChar('Q');
        oos.writeDouble(9.2);
        oos.writeUTF("jdajfa");

        oos.writeObject(new Dog("jack",100));

        oos.close();
    }
}
