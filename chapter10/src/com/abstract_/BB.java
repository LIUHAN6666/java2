package com.abstract_;

public class BB extends Template{

    public void job() {
        long num = 0;
        for (int i = 0; i <=8000000; i++) {
            num *= i;
        }
    }
}
