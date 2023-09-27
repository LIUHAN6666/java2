package com.hspedu.socket;

import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class SocketTcp01Client {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket((InetAddress.getLocalHost()), 9999);
        System.out.println("客户端socket返回="+ socket.getClass());

        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello,server".getBytes());
        outputStream.close();
        socket.close();
    }
}
