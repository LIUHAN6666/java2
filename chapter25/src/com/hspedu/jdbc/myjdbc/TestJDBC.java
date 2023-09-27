package com.hspedu.jdbc.myjdbc;

public class TestJDBC {
    public static void main(String[] args) {
      jdbcinterface jdface= new Mysqljdb();
       jdface.getConnection();

    }
}
