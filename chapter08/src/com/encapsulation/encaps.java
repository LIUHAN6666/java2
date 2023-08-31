package com.encapsulation;

public class encaps {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jackmmmmmmmm");
        person.setAge(300);
        person.setSalary(30000);
        System.out.println(person.info());
    }
}
class Person {
    public String name;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 2 && name.length() <= 6 ) {
            this.name = name;
        } else {
            System.out.println("名字长度不对，默认丁真");
            this.name = "丁真";
        }

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("年龄在1 - 120");
            this.age = 18;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info() {
        return "信息为=" + name + " " + "age="  + age + "  " + "薪水" + salary;
    }
}

