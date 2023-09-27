package com.hspedu.bufferedreader;

import java.io.*;

public class BufferedCopy01 {
    public static void main(String[] args) throws Exception {
        String srcFilePath ="e:\\a.java";
        String desFilePath ="e:\\a2.java";
        String line;
        BufferedReader br = null;
        BufferedWriter bw = null;
            br  =  new BufferedReader(new FileReader(srcFilePath));
            bw  =  new BufferedWriter(new FileWriter(srcFilePath));

            while ((line = br.readLine()) != null) {

                bw.write(line);
                bw.newLine();
            }

            if (br != null) {
                br.close();
            }
            if (bw != null) {
                bw.close();
            }

    }
}
