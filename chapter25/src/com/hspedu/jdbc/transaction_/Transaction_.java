package com.hspedu.jdbc.transaction_;

import com.hspedu.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transaction_ {
    public void noTransaction(){
        Connection connection = null;
        String sql = "update account set balance = balance -100where id =1";
        String sql2 = "update account set balance = balance + 100where id =2";
        PreparedStatement preparedStatement = null;
        try {
            connection = JDBCUtils.getConnection();
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();

            preparedStatement =  connection.prepareStatement(sql2);
            preparedStatement.executeUpdate();
            connection.commit();
        } catch (SQLException e) {

            try {
                connection.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }

            e.printStackTrace();
        } finally {
            JDBCUtils.close(null, preparedStatement, connection);
        }
    }
}



