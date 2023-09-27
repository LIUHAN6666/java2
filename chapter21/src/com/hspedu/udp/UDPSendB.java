package com.hspedu.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSendB {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket(9998);

        byte[] data = "hello 明天吃火锅".getBytes();

        DatagramPacket packet = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.12.1"), 9999);
        socket.send(packet);

        byte[] buf = new byte[1024];

      packet = new DatagramPacket(buf, buf.length);

        socket.receive(packet);

        int length = packet.getLength();
       data = packet.getData();

        String s = new String(data, 0, length);
        System.out.println(s);


        socket.close();
        System.out.println("B端退出");
    }
}
