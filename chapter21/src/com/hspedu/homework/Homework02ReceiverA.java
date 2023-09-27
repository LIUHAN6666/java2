package com.hspedu.homework;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Homework02ReceiverA {
    public static void main(String[] args) throws Exception{
        DatagramSocket socket = new DatagramSocket(8888);
        byte[] buf = new byte[1024];

        DatagramPacket packet = new DatagramPacket(buf, buf.length);

        socket.receive(packet);

        int length = packet.getLength();
        byte[] data = packet.getData();
        String s = new String(data, 0, length);
        String answer = "";

        if("四大名著是哪些".equals(s)) {
            answer = "红楼梦，三国演义，西游记，水浒传";
        } else {
            answer = "what?";
        }
        System.out.println(s);


        data = answer.getBytes();

        packet = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.12.1"), 9998);
        socket.send(packet);


        socket.close();
        System.out.println("A端退出");

    }
}


