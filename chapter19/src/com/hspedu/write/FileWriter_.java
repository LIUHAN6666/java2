package com.hspedu.write;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ {
    public static void main(String[] args) {
        String filePath = "e:\\note.txt";
        FileWriter fileWriter = null;
        char[] chars = {'a', 'b', 'c', 'd'};

        try {
            fileWriter = new FileWriter(filePath);
            fileWriter.write('H');

            fileWriter.write(chars);
            fileWriter.write("练习时长两年半".toCharArray(), 0, 3);

            fileWriter.write("dsdfsaf   ");

            fileWriter.write("上海一",0,2);


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
