package com.hspedu.upload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPFileUploadServer {
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务端在8888端口监听");
        Socket socket = serverSocket.accept();

        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);


        String desFilePath = "src\\qie2.png";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(desFilePath));
        bos.write(bytes);


        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        writer.write("收到");
        writer.flush();
        socket.shutdownOutput();


        writer.close();
        bos.close();
        bis.close();
        socket.close();
        serverSocket.close();


    }
}
