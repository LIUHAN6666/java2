package com.InnerClass;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f1();
    }
}
class Outer05 {
    private int n1 = 99;
    public void f1 (){
        Person person = new Person() {
            @Override
            public void hi() {
                System.out.println("chongxiele");
            }
        };
        person.hi();
        new Person(){

            public void  hi () {
                System.out.println("hi.how are you");
            }
        }.hi();
    }
}
class Person {

    public void  hi () {
        System.out.println("hi.how are you");
    }


}
