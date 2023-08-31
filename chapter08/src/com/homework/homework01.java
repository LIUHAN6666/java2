package com.homework;

public class homework01 {
    public static void main(String[] args) {
        Person[] person = new Person[3];
        person[0] = new Person("丁真", 10, "放羊");
        person[1] = new Person("保国", 45, "打太极");
        person[2] = new Person("坤坤", 30, "打篮球");
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }

        Person tmp = null;
        for (int i = 0; i < person.length - 1; i++) {
            for (int j = 0; j < person.length - 1 - i; j++) {
                if (person[j].getAge() < person[j + 1].getAge()) {
                    tmp = person[j];
                    person[j] = person[j + 1];
                    person[j + 1] = tmp;
                }
            }
        }
        System.out.println("排序后的效果");
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }
    }
}
class Person {
    private String name;
  private int age;
    private String job;

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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}