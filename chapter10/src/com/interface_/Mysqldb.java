package com.interface_;

public class Mysqldb implements Dbinterfance{

        public void connect() {
            System.out.println("Mysql");
        }


        public void close() {
            System.out.println("mysal");
        }
    }

