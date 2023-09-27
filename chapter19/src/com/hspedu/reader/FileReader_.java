package com.hspedu.reader;

import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;

public class FileReader_ {


    public static void main(String[] args) {
    }
@Test
    public void readFile01(){

        String filePath = "e:\\story.txt";

        FileReader fileReader = null;
        int date = 0;


        try {
            fileReader = new FileReader(filePath);
            while ((date = fileReader.read()) != -1) {
                System.out.println((char) date);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public void readFile02() {

        String filePath = "e:\\story.txt";

        FileReader fileReader = null;
        int readLen = 0;
        char[] buf = new char[23];

        try {
            fileReader = new FileReader(filePath);
            while ((readLen = (fileReader.read(buf))) != -1) {
                System.out.println(new String(buf,0,readLen) );
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

