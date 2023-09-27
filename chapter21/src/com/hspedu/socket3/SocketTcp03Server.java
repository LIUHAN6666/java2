package com.hspedu.socket3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketTcp03Server {
    public static void main(String[] args) throws Exception{
        ServerSocket serverSocket = new ServerSocket(9999);

        Socket socket = serverSocket.accept();//阻塞

        System.out.println("服务端在socket=" + socket.getClass());

        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);

        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello client  字符流");
        bufferedWriter.newLine();
        bufferedWriter.flush();


        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
        serverSocket.close();
    }
}
