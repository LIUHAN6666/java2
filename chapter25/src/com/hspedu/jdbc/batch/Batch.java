package com.hspedu.jdbc.batch;

import com.hspedu.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Batch {
    public void Batch()throws Exception{
        Connection connection = JDBCUtils.getConnection();
        String sql = "insert into admin2 values(null,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        for (int i =0; i <5000; i++) {
            preparedStatement.setString(1,"jack" +1);
            preparedStatement.setString(2,"666");

            preparedStatement.addBatch();
            if ((i + 1) % 1000 == 0) {
                preparedStatement.executeBatch();
                preparedStatement.clearBatch();
            }
        }
        JDBCUtils.close(null,preparedStatement,connection);
    }
}
