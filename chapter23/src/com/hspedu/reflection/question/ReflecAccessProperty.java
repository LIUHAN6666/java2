package com.hspedu.reflection.question;

import java.lang.reflect.Field;

public class ReflecAccessProperty {
    public static void main(String[] args) throws Exception {
        Class<?> stu = Class.forName("com.hspedu.reflection.question.Student");
        Object o = stu.newInstance();
        System.out.println(o.getClass());

        Field age = stu.getField("age");
        age.set(o, 88);

        Field name = stu.getDeclaredField("name");
        name.setAccessible(true);
        // 由于"name"是静态字段，设置其值时，请将null作为参数传递
        name.set(null, "marry");

        System.out.println(o);
    }
}

class Student {
    public int age;
    private static String name;

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +  "        " +"name= " + name +
                '}';
    }

    public Student() {
    }


}







