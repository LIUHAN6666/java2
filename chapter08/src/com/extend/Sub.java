package com.extend;

public class Sub extends Base{
    public Sub() {
        System.out.println("sub()....");
    }
    public void sayOk() {
        System.out.println(n1 + " " + n2 + " " + n3);
        test100();
        test200();
        test300();
        System.out.println("n4=" + getN4());
        callTest400();
    }
}
