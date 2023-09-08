package com.hspedu.customexception;

public class CustomException {
    public static void main(String[] args) {
        int age = 56;
        if (!(age >= 18 && age <= 120)) {
            throw new AgeException("年龄需要在80-120");
        }
        System.out.println("zhengque");
    }
}
class AgeException extends RuntimeException{
    public AgeException(String message) {
        super(message);
    }
}
