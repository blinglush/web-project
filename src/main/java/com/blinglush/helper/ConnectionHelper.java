package com.blinglush.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: shrestar
 * Date: 2014-09-26
 * Time: 2:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConnectionHelper {
    private static Connection conn = null;
    private static String driver_class = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost/DB_MVC_JUL20";
    private static String username = "root";
    private static String password = "de11@6342";

    private ConnectionHelper() {

    }

    public static Connection getConnection() {
        if (conn == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                System.out.println("driver registered");
                conn = DriverManager.getConnection(url, username, password);
            } catch (Exception e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
        }
        return conn;

    }

    public static void main(String[] args) {
        Connection connection = ConnectionHelper.getConnection();
        if (connection != null) {
            System.out.println("Connection established " +connection);
        }
    }
}
