package com.blinglush.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: shrestar
 * Date: 2014-08-17
 * Time: 10:13 AM
 * To change this template use File | Settings | File Templates.
 */
public class DBConnectionManager {
    private Connection conn;

    public DBConnectionManager(String dbURL, String user, String pwd) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        this.conn = DriverManager.getConnection(dbURL, user, pwd);
    }

    public Connection getConnection(){
        return this.conn;
    }

}
