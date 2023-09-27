package com.hspedu.homework;

import java.io.*;

public class Homework01 {
    public static void main(String[] args) throws IOException {
String directoryPath = "e:\\mytemp";

        File file = new File(directoryPath);

        if(!file.exists()) {
            if (file.mkdirs()) {
                System.out.println("创建成功");
            } else {
                System.out.println("失败");
            }
        }
        String filePath = directoryPath + "\\hello.txt";
        file = new File(filePath);
        if (!file.exists()) {
            if(file.createNewFile()) {
                System.out.println("创建成功");

                BufferedWriter buffered = new BufferedWriter(new FileWriter(file));
                buffered.write("hello,world");
                buffered.close();
            }else {
                System.out.println("失败");
            }
        } else {
            System.out.println("已经存在");
        }
    }
}
