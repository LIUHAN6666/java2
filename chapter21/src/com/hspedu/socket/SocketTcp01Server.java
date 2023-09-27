package com.hspedu.socket;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTcp01Server {
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(9999);

        Socket socket = serverSocket.accept();//阻塞

        System.out.println("服务端在socket=" + socket.getClass());

        InputStream inputStream = socket.getInputStream();

        byte[] buf = new byte[1024];
        int readLIne = 0;
        while ((readLIne = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf,0,readLIne));
        }
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
