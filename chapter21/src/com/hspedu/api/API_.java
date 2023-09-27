package com.hspedu.api;

import java.net.InetAddress;

public class API_ {
    public static void main(String[] args) throws Exception{
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);

        InetAddress mbp = InetAddress.getByName("appledeMBP");
        System.out.println(mbp);

        InetAddress byName = InetAddress.getByName("www.baidu.com");
        System.out.println(byName);

        String address = byName.getHostAddress();
        System.out.println(address);

        String hostName = byName.getHostName();
        System.out.println(hostName);
    }
}
