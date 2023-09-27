package com.hspedu.homework;

import com.hspedu.upload.StreamUtils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Homework03servier {
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();

        byte[] bytes = new byte[1024];
        int leng = 0;

        String dowmloadFileName = "";
        while ((leng = inputStream.read(bytes)) != -1) {
            dowmloadFileName += new String(bytes,0,leng);
        }
        System.out.println("客户端希望下载文件名=" + dowmloadFileName);

        String resFileName = "";
        if ("高山流水".equals(dowmloadFileName)) {
            resFileName = "src\\高山流水.mp3";
        } else {
            resFileName ="src\\无名.mp3";
        }
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(resFileName));
        byte[] bytes1 = StreamUtils.streamToByteArray(bis);
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes1);
        socket.shutdownOutput();

        bis.close();
        inputStream.close();
        socket.close();
        serverSocket.close();

    }
}
