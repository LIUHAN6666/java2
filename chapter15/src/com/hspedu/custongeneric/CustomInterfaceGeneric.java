package com.hspedu.custongeneric;

public class CustomInterfaceGeneric {
    public static void main(String[] args) {

    }
}
interface Iusb <U,R> {
    R get(U u);
    void hi(R r);
    void run(R r1,R r2,U u2);
    default R method(U u){
        return null;
    }
}
class CC implements Iusb {
    @Override
    public Object get(Object o) {
        return null;
    }

    @Override
    public void hi(Object o) {

    }

    @Override
    public void run(Object r1, Object r2, Object u2) {

    }

    @Override
    public Object method(Object o) {
        return Iusb.super.method(o);
    }
}