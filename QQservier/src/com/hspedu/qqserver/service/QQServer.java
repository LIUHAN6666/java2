package com.hspedu.qqserver.service;

import com.hspedu.qq.common.Message;
import com.hspedu.qq.common.MessageType;
import com.hspedu.qq.common.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class QQServer {
    private ServerSocket ss = null;
private static HashMap<String,User> vaidUser = new HashMap<>();
static {
    vaidUser.put("100",new User("100","123456"));
    vaidUser.put("100",new User("100","123456"));
    vaidUser.put("100",new User("100","123456"));
}



    public QQServer() {
        System.out.println("zaijianting");

        try {
            ss = new ServerSocket(9999);

            while (true) {
                Socket socket = ss.accept();
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                User u = (User) ois.readObject();
                Message message = new Message();

                if (u.getUserId().equals("100") && u.getPasswd().equals("123456")) {
                    message.setMesType(MessageType.MESSAGE_LOGIN_SUCCEED);
                    oos.writeObject(message);
                    ServerConnectClientThread thread = new ServerConnectClientThread(socket, u.getUserId());
                    thread.start();

                    ManageClientThread.addClientThread(u.getUserId(), thread);
                }else {
                    message.setMesType(MessageType.MESSAGE_LOGIN_FAIL);
                    oos.writeObject(message);
                    socket.close();
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                ss.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
