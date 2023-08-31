package com.homework.homework11;

public class homework11 {
    public static void main(String[] args) {
        Student student = new Student("小明", '男', 15, "00023102");
        student.printinfo();
        Teacher teacher = new Teacher("张飞", '男', 30, 5);
        System.out.println("=========================");
        teacher.printinfo();
        Person[] persons = new Person[4];
        persons[0] = new Student("小黄", '男', 10, "0001");
        persons[1] = new Student("小红", '女', 12, "0002");
        persons[2] = new Teacher("关羽", '男', 38, 400);
        persons[3] = new Teacher("刘备", '男', 43, 500);
        homework11 homework11 = new homework11();
        homework11.bubblesort(persons);
        System.out.println("-------排序后的情况--------");
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i]);
        }
        System.out.println("----------------------");
        for (int i = 0; i < persons.length; i++) {
            homework11.test(persons[i]);
            
        }
    }
     public void test(Person p) {
        if (p instanceof Student) {
            ((Student) p).Study();
        } else if (p instanceof Teacher) {
            ((Teacher) p).Teach();
        } else {
            System.out.println("do nothing......");
        }
     }
    public void bubblesort(Person[] person) {
        Person temp = null;
        for (int i = 0; i < person.length - 1; i++) {
            for (int j = 0; j < person.length - 1 - i; j++) {
                if (person[j].getAge() < person[j + 1].getAge()) {
                    temp = person[j];
                    person[j] = person[j + 1];
                    person[j + 1] = temp;
                }
            }
        }
    }
}
