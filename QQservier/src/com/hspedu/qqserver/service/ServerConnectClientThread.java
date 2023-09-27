package com.hspedu.qqserver.service;

import com.hspedu.qq.common.Message;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

public class ServerConnectClientThread extends Thread{
    private Socket socket;
    private String userId;

    public ServerConnectClientThread(Socket socket, String userId) {
        this.socket = socket;
        this.userId = userId;
    }

    @Override
    public void run() {
        while (true){
            try {
                System.out.println("服务端客户端保持通讯");
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                Message message =(Message) ois.readObject();
            } catch (Exception e) {
               e.printStackTrace();
            }
        }
    }
}
