package com.hspedu.qqclient_;

import com.hspedu.qqcommen.Message;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

public class ClientConnectServerThread extends Thread {

    private Socket socket;
    public ClientConnectServerThread(Socket socket) {
        this.socket = socket;
    }

    public void run(){
        while (true) {

            try {
                System.out.println("客户端线程等待读取");
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                Message message = (Message) ois.readObject();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }


    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }
}
