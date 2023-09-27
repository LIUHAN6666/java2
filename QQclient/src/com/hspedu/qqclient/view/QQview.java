package com.hspedu.qqclient.view;

import com.hspedu.qqclient_.UserClientServise;

import java.util.Scanner;

public class QQview {
    private boolean loop = true;
    private String key = "";
    private UserClientServise userClientServise = new UserClientServise();

    public static void main(String[] args) {
        new QQview().mainView();
    }

    private void mainView() {
        while (loop) {
            System.out.println("====================");
            System.out.println("\t\t 1 登陆系统");
            System.out.println("\t\t 9 退出系统");


            switch (key) {
                case "1":
                    System.out.print("请输入用户号");

                    System.out.print("请输入密码");
                    if (userClientServise.checkUser()) {
                        System.out.println("=========");
                        while (loop) {
                            System.out.println("二级菜单");
                        }
                    } else {

                        System.out.println("登陆失败");
                    }

            case "9":
                loop = false;
                break;
            }
        }
    }
}
