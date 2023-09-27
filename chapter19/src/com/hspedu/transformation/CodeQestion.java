package com.hspedu.transformation;

import java.io.BufferedReader;
import java.io.FileReader;

public class CodeQestion {
    public static void main(String[] args) throws Exception{
        String filePath = "e:\\a.txt";
        BufferedReader br = new BufferedReader(new FileReader(filePath));

        String s = br.readLine();
        System.out.println(s);

        br.close();
    }
}
