package com.hspedu.generic;

import java.util.ArrayList;
import java.util.Comparator;

public class Genericexericse02 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("tom", 2000, new MyDate(2000, 11, 11)));
        employees.add(new Employee("tom", 3900, new MyDate(2002, 04, 13)));
        employees.add(new Employee("tom", 5000, new MyDate(2001, 03, 21)));
        System.out.println(employees);
        System.out.println("====================");


        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                if (!(emp1 instanceof Employee && emp2 instanceof Employee)) {
                    System.out.println("类型不正确");
                    return 0;
                }
                int i = emp1.getName().compareTo(emp2.getName());
                if (i != 0) {
                    return i;
                }
                return emp1.getBirthday().compareTo(emp2.getBirthday());
            }

        });
        System.out.println(employees);
    }
}





