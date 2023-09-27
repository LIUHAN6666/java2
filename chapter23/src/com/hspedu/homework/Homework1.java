package com.hspedu.homework;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Homework1 {
    public static void main(String[] args) throws Exception {
        Class<PrivateTest> aClass = PrivateTest.class;
        PrivateTest instance = aClass.newInstance();
        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(instance, "cat");

        Method method = aClass.getMethod("getName");
        Object invoke = method.invoke(instance);
        System.out.println(invoke);
    }

}

class PrivateTest {
    private String name = "dog";

    public String getName() {
        return name;
    }
}
