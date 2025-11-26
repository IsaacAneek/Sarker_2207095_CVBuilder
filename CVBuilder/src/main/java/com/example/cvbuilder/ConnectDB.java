package com.example.cvbuilder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
    private Connection connection;

    public ConnectDB() {
        String url = "jdbc:sqlite:cvdb.db";

        try {
            connection = DriverManager.getConnection(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    Connection getConnection() {
        return connection;
    }

    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
