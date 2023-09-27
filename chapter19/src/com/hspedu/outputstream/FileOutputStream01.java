package com.hspedu.outputstream;


import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileOutputStream01 {
    public static void main(String[] args) {

    }

    @Test
    public void writeFile() {

        String filePath = "e:\\a.txt";
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(filePath);
            fileOutputStream = new FileOutputStream(filePath,true);
            fileOutputStream.write('A');

            String str = "hello,world";
            //fileOutputStream.write(str.getBytes());
            fileOutputStream.write(str.getBytes(),0,3);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
