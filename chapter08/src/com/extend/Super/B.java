package com.extend.Super;

public class B extends A{
    public void hi() {
        System.out.println(super.n1 + " " + super.n2 + " "+ super.n3);
    }

public int n1 = 888;
    public void test() {
        System.out.println(super.n1);
    }

    public void sum () {
        System.out.println("B类的sum");
        //cal();
        //this.cal();
        super.cal();
    }
    public void ok() {
        super.test100();
        super.test200();
        super.test300();
    }
    public B () {

    }
}
