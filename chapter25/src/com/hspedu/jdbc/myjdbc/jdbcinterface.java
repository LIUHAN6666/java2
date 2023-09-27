package com.hspedu.jdbc.myjdbc;

import java.sql.Connection;

public interface jdbcinterface {
    public Object getConnection() ;

    public  void crud();

    public void  close();

}
