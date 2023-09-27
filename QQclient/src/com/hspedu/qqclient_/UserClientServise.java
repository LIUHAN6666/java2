package com.hspedu.qqclient_;

import com.hspedu.qqcommen.Message;
import com.hspedu.qqcommen.MessageType;
import com.hspedu.qqcommen.User;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class UserClientServise {

    private User u = new User();
    private Socket socket;

    public boolean checkUser() {

        boolean b = false;
        u.setUserId();
        u.setPasswd();

        try {
            Socket socket = new Socket(InetAddress.getByName("127,0,0.1"), 9999);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(u);

            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            Message ms = (Message) ois.readObject();

            if (ms.getMesType().equals(MessageType.MESSAGE_LOGIN_SUCCEED)) {


                ClientConnectServerThread ccst = new ClientConnectServerThread(socket);
                ccst.start();
                ClientConnectServerThread clientConnectServerThread;
                ManageClientConnectServerThread.addClientConnectServerThread(u.getUserId(), ccst);
                b = true;
            } else {
                socket.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }

    public void onlineFriendList(){
    }
}

