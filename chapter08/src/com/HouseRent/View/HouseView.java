package com.HouseRent.View;


import com.HouseRent.Domain.House;
import com.HouseRent.Service.houseservice;

import java.util.Scanner;

public class HouseView {

        private boolean loop = true;
        private char key = ' ';
        private houseservice houseservice = new houseservice(10);

        public void ListHouses (){
            System.out.println("============房屋列表===========");
            System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态（未出租/已出租）");
            House[] houses = houseservice.list();
            for (int i = 0; i < houses.length; i++) {

                System.out.println(houses[i]);
            }
            System.out.println("============房屋列表显示完毕===========");
        }
        private Scanner scanner;
        public HouseView() {
        scanner = new Scanner(System.in); // 初始化Scanner对象
    }
        public void mainMenu(){

            do {
                System.out.println("=============房屋出租系统============");
                System.out.println("\t\t\t1 新 增 房 源 ");
                System.out.println("\t\t\t2 查 找 房 屋 ");
                System.out.println("\t\t\t3 删 除 房 屋 信 息 ");
                System.out.println("\t\t\t4 修 改 房 屋 信 息 ");
                System.out.println("\t\t\t5 房 屋 列 表 ");
                System.out.println("\t\t\t6 退      出 ");
                System.out.println("\t\t\t7 请输入你的选择 1-6： ");
                String input = scanner.nextLine();
                key = input.charAt(0);

                switch (key) {
             case'1':
                 System.out.println("新 增");
                 break;
             case'2':
                 System.out.println("查 找");
                 break;
             case'3':
                 System.out.println("删 除");
                 break;
             case'4':
                 System.out.println("修 改");
                 break;
             case'5':
               ListHouses();
                 break;
             case'6':
                 System.out.println("退出");
                 loop = false;
                 break;

         }
            } while (loop);
    }
}
