package com.hspedu.bufferedreader;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedCopy02 {
    public static void main(String[] args) throws Exception{
        String srcFilePath ="e:\\koala.jpg";
        String desFilePath ="e:\\hsp.jpg";

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        bis = new BufferedInputStream(new FileInputStream(srcFilePath));
        bos = new BufferedOutputStream(new FileOutputStream(desFilePath));

        byte[] bytes = new byte[1034];
        int readLen = 0;
        while ((readLen = bis.read(bytes)) != -1) {
            bos.write(bytes,0,readLen);
        }
        if(bis != null) {
            bis.close();
        }
        if (bos != null) {
            bos.close();
        }
    }
}
