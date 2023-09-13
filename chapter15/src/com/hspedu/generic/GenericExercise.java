package com.hspedu.generic;

import java.util.*;

public class GenericExercise {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("jack",18));
        students.add(new Student("tom",28));
        students.add(new Student("marry",17));
        for (Student s :students) {
            System.out.println(s);
        }

        HashMap<String, Student> map = new HashMap<String,Student>();
        map.put("米兰",new Student("milan",38));
        map.put("史密斯",new Student("smith",21));
        map.put("鲍勃",new Student("Bob",31));
        Set<Map.Entry<String, Student>> entries = map.entrySet();
        Iterator<Map.Entry<String, Student>> it = entries.iterator();
        while (it.hasNext()) {
            Map.Entry<String, Student> next =  it.next();
            System.out.println(next.getKey() + "  " + next.getValue());

        }


    }
}
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
