package com.hspedu.file;

import java.io.File;

public class Directory_ {
    public static void main(String[] args) {

    }

    public void m1() {
        String filePath = "d:\\news01.text";
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("chenggong");
            } else {
                System.out.println("shibai");
            }
        } else {
            System.out.println("bucunzai");
        }
    }


    public void m2() {
        String filePath = "D:\\demo2";
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("chenggong");
            } else {
                System.out.println("shibai");
            }
        } else {
            System.out.println("bucunzai");
        }
    }


    public void m3() {
        String directoryPath = "d:\\demo\\a\\b\\c";
        File file = new File(directoryPath);
        if (file.exists()) {
            System.out.println("cunzai");
        } else {
            if (file.mkdirs()) {
                System.out.println("成功");
            } else {
                System.out.println("失败");
            }

        }
    }
}


