package com.hspedu.homework01;

import org.junit.jupiter.api.Test;

import java.util.List;

public class Homework01 {

    @Test
    public void testList() {
        DAO<User> dao = new DAO<>();
        dao.save("001",new User(1,10,"jack"));
        dao.save("002",new User(2,14,"ling"));
        dao.save("003",new User(3,18,"lucy"));
        List<User> list = dao.list();
        System.out.println(list);
    }
}



