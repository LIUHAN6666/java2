package com.hspedu.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPRecevierA {
    public static void main(String[] args) throws Exception{
        DatagramSocket socket = new DatagramSocket(9999);
        byte[] buf = new byte[1024];

        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        System.out.println("接收端A等待接收数据");
        socket.receive(packet);

        int legngth = packet.getLength();
        byte[] data = packet.getData();

        String s = new String(data, 0, legngth);
        System.out.println(s);


       data = "Ok 明天".getBytes();

       packet = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.12.1"), 9998);
        socket.send(packet);


        socket.close();
        System.out.println("A端退出");

    }
}
