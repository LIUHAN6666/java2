package com.InnerClass;

public class MemberInnerClass {
    public static void main(String[] args) {
        Outer08 outer08 = new Outer08();
        outer08.t1();
        Outer08.Inner08 inner08 = outer08.new Inner08();
        inner08.say();

    }
}
class Outer08 {
    private int n1 = 10;
    public String name = "daad";
    private void hi(){

        System.out.println("dqqq");
    }
    class Inner08 {
        private double sal = 66.3;
        private int n1 = 67;
        public void say(){
            System.out.println("sdasd" + " " + n1 + " " + name + Outer08.this.n1);//直接访问
            hi();
        }

    }
    public void  t1(){
        Inner08 inner08 = new Inner08();
        inner08.say();
        System.out.println(inner08.sal);
    }
}
