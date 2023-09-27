package com.hspedu.bufferedreader;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReader02 {
    public static void main(String[] args) throws IOException {
        String filePath = "e.\\ok.txt";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath,true));
        bufferedWriter.write("jack,hello");
        bufferedWriter.newLine();
        bufferedWriter.write("jack,hello1");
        bufferedWriter.newLine();
        bufferedWriter.newLine();
        bufferedWriter.newLine();
        bufferedWriter.newLine();
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
