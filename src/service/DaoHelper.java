package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaoHelper {
    private static final String url = "jdbc:mysql://localhost/student";
    private static final String name = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "root";
    public static Connection getConnection() {
        try {
            Class.forName(name);
            Connection connection = DriverManager.getConnection(url, user, password);
            return connection;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void close(){

    }
}
