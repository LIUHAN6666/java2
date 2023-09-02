package com.abstract_;

public class CommomEmployee extends Employee{
    public CommomEmployee(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    public void work() {
        System.out.println("普通员工"+getName() + "工资中" );
    }
}
