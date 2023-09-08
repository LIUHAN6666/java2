package com.hspedu.stringbuffer;

public class StringBufferMethod {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("hello");
        s.append(",");
        s.append("马云xx");
        s.append("马云").append(100).append(true).append(10.5);
        System.out.println(s);

        s.delete(11,14);
        System.out.println(s);

        s.replace(9,11,"马斯克");
        System.out.println(s);

        int index = s.indexOf("e");
        System.out.println(index);

        s.insert(9,"扎克伯格");
        System.out.println(s);

        System.out.println(s.length());
    }
}
