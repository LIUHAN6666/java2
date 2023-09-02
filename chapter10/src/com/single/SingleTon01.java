package com.single;

public class SingleTon01 {
    public static void main(String[] args) {
        GrilFriend instance = GrilFriend.getInstance();
        System.out.println(instance);
        GrilFriend instance1 = GrilFriend.getInstance();
        System.out.println(instance1);
    }

}
class GrilFriend{
    private String name;
    private static GrilFriend gf = new GrilFriend("小红");
    private GrilFriend (String name) {
        this.name = name;
    }
    public static GrilFriend getInstance() {
        return gf;
    }

    @Override
    public String toString() {
        return "GrilFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
