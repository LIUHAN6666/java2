package com.interface_;

public class Phone implements UsbInterface {
    public void start() {
        System.out.println("手机工作了.....");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作了.....");
    }
}
