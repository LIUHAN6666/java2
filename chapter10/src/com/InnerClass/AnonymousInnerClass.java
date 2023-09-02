package com.InnerClass;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}
class Outer04 {
    private int n1 = 10;
    public void method (){
     IA tiger = new IA () {
         public void cry(){
             System.out.println("老虎叫唤");
         }
     };
        System.out.println(tiger.getClass());
        tiger.cry();
        tiger.cry();
        tiger.cry();
      Father father = new Father("jack") {
          @Override
          public void Test() {
              System.out.println("重写test方法");
          }
      };
        System.out.println(father.getClass());
        father.Test();
        Animal animal = new Animal(){
            @Override
            void eat() {
                System.out.println("小狗吃骨头");
            }
        };
        animal.eat();
    }
}
interface IA {
    public void cry();

}
class Father{
    public Father(String name) {
        System.out.println(name);
    }
   public void Test(){

   }
}
abstract class Animal {
    abstract void eat();
}


