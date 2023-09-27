package com.hspedu.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;

public class ReflectionUtils01 {
    public static void main(String[] args) {

    }

    public void api_02() throws Exception{
        Class<?> aClass = Class.forName("com.hspedu.reflection.Person");
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName() + declaredField.getModifiers());
            System.out.println(declaredField.getName() + declaredField.getType());
        }


        Method[] declaredMethod = aClass.getDeclaredMethods();
        for (Method dec : declaredMethod) {
            System.out.println(dec.getName() + dec.getModifiers());
            System.out.println(dec.getName() + dec.getReturnType());

            Class<?>[] types = dec.getParameterTypes();
            for (Class<?> type : types) {
                System.out.println(type);

            }
        }

        Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor.getName());

            Class<?>[] parameterTypes = declaredConstructor.getParameterTypes();
            for (Class<?> type : parameterTypes) {
                System.out.println(type);
            }
        }





    }
}
