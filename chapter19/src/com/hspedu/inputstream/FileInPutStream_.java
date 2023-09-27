package com.hspedu.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInPutStream_ {
    public static void main(String[] args) {

    }

    public void readFile01() {
        String filePath = "e:\\hello.txt";
        int readDate = 0;
        FileInputStream fileInputStream = null;


        try {
            fileInputStream = new FileInputStream(filePath);

            while ((readDate = fileInputStream.read()) != -1) {
                System.out.print((char) readDate);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public void readFile02() {
        String filePath = "e:\\hello.txt";
        byte[] buf = new byte[8];
        int readLen = 0;
        FileInputStream fileInputStream = null;


        try {
            fileInputStream = new FileInputStream(filePath);

            while ((readLen = fileInputStream.read(buf)) != -1) {
                System.out.print(new String(buf, 0, readLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
