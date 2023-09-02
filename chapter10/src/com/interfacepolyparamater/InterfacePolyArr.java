package com.interfacepolyparamater;

public class InterfacePolyArr {
    public static void main(String[] args) {
       Usb[] usbs = new Usb[2];
       usbs[0] = new phone();
       usbs[1] = new camera();
        for (int i = 0; i < usbs.length; i++) {
            usbs[i].work();
            if(usbs[i] instanceof phone) {
                ((phone) usbs[i]).call();
            }
        }
    }
}
interface Usb{
    void work();
}
class phone implements Usb{
    public void call (){
        System.out.println("手机可以带电话");
    }

    @Override
    public void work() {
        System.out.println("手机工作中");
    }
}
class camera implements Usb {
    public void work() {
        System.out.println("相机工作中");
    }
}