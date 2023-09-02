package com.interface_;

public class Camera implements UsbInterface{
    @Override
    public void start() {
        System.out.println("相机工作了.....");
    }

    @Override
    public void stop() {
        System.out.println("相机停止工作了.....");
    }
}
