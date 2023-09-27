package com.hspedu.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionUtils {
    public static void main(String[] args) {

    }
    public void api_01() throws Exception{
        Class<?> aClass = Class.forName("com.hspedu.reflection.Person");
        System.out.println(aClass.getName());

        System.out.println(aClass.getSimpleName());

        Field[] fields = aClass.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
        }

        Method[] method = aClass.getMethods();
        for (Method method1 : method) {
            System.out.println(method1.getName());
        }

        Method[] declaredMethod = aClass.getDeclaredMethods();
        for (Method dec : declaredMethod) {
            System.out.println(dec.getName());
        }
        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.getName());
        }

        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }

        System.out.println(aClass.getPackageName());

        Class<?> superclass = aClass.getSuperclass();
        System.out.println(superclass);

        Class<?>[] interfaces = aClass.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface);
        }

        Annotation[] annotation = aClass.getAnnotations();
        for (Annotation annotation1 : annotation) {
            System.out.println(annotation1);

        }

    }
}
class A {
    public String hobby;

    public void hi() {
    }
    public A(){}
}
interface IA{}
interface IB{}

class Person extends A implements IA,IB{
    public String name;
    protected int age;
    String job;
    private double sal;

    public void m1() {
    }

    protected void m2() {
    }

    void m3() {
    }

    private void m4() {
    }


    public Person() {
    }
    public  Person(String name){}
}
