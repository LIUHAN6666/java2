package com.Poly.polyarr;

public class ployarray {
    public static void main(String[] args) {
        Person[] person = new Person[5];

        person[0] = new Person("jack", 20);
        person[1] = new Student("marry", 18, 100);
        person[2] = new Student("simth", 12, 90);
        person[3] = new Teacher("scoot", 48, 6000);
        person[4] = new Teacher("马", 32, 10000000);
        for (int i = 0; i < person.length; i++) {
            person[i].say();
            System.out.println(person[i].say());

            if (person[i] instanceof Student) {
                Student student = (Student) person[i];
                student.study();
            } else if (person[i] instanceof Teacher) {
               Teacher teacher = (Teacher) person[i];
               teacher.teach();
            } else if (person[i] instanceof Person) {

            } else {
                System.out.println("输入有误");
            }
        }
    }
}
