package com.hspedu.stringbuffer;

public class StringANdStringBuffer {
    public static void main(String[] args) {
        String N = "mark";
        StringBuffer stringBuffer = new StringBuffer(N);

        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1 = stringBuffer1.append(N);


        StringBuffer stringBuffer2 = new StringBuffer("jerry");
        String s = stringBuffer2.toString();

        String r = new String(stringBuffer2);


    }
}
