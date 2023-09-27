package com.hspedu.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCUtils_USE {
    public static void main(String[] args) {

    }
    public void testDML() {
        Connection connection = JDBCUtils.getConnection();
        String sql = "update actor set name =?where id =?";

        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "周星驰");
            preparedStatement.setInt(2, 4);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(null, preparedStatement, connection);
        }
    }
}
