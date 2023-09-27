package com.hspedu.properties;

import java.io.BufferedReader;
import java.io.FileReader;

public class Properties01 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("src\\mysql.properties"));

        String line = "";
        while ((line = br.readLine()) != null) {

            String[] split = line.split("=");
            System.out.println(split[0]  + split[1]);

        }
        br.close();
    }
}
