package com.hspedu.homework;

import java.io.BufferedReader;
import java.io.FileReader;

public class Homework02 {
    public static void main(String[] args) throws Exception{
        String filePath = "e:\\a.txt";
        String line = " ";
        int lineNum = 0;
        BufferedReader br = null;
              br =  new BufferedReader(new FileReader(filePath));
              while ((line = br.readLine()) != null) {
                  System.out.println(++lineNum + line);
              }
              if (br != null) {
                  br.close();
              }

    }
}
