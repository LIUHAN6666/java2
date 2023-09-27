package com.hspedu.file;

import java.io.File;
import java.io.FilePermission;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {

    }
    public void create01(){
        String filePath = "e:\\news1.text";
        File file = new File(filePath);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void create02(){
        File parentFilefile = new File("e:\\");
        String fileName = "news.txt";
        File file = new File(parentFilefile, fileName);

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    public void create03(){
        String parentPath = "e\\";
        String fileName = "news3.txt";
        File file = new File(parentPath,fileName);

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
