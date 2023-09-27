package com.hspedu.dao_.test;

import com.hspedu.dao_.dao.ActorDAO;
import com.hspedu.dao_.domain.Actor;

import java.util.List;

public class TestDAO {

    public void testActorDAO(){
        ActorDAO actorDAO = new ActorDAO();

//      List<Actor> actors = actorDAO.queryMulti("select* from actor where id >=?", Actor.class,1);
//
//        for (Actor actor :actors) {
//            System.out.println(actor);
//        }


//        Actor actor = actorDAO.querySingle("select* from actor where id =?", Actor.class,6);
//       System.out.println(actor);
//



   }

}
