package com.blinglush.maintest;

import java.io.*;
import java.sql.*;
import java.util.Properties;

/**
 * Created with IntelliJ IDEA.
 * User: shrestar
 * Date: 2014-08-25
 * Time: 8:34 AM
 * To change this template use File | Settings | File Templates.
 */
public class JdbcConnectionMain {

    private static Properties prop = new Properties();
    private static OutputStream output = null;
    private static InputStream input = null;
    private static Connection connection = null;

    public static void main(String[] args) {

        Statement stmt = null;
        ResultSet rs = null;

        File fileToRead = new File("/Users/shrestar/Documents/ideaProjects/maven-projects/web-project/src/main/resources/database.properties");
        if (fileToRead.isFile()) {
            try {
                input = new FileInputStream(fileToRead);
                prop.load(input);
                String Driver = prop.getProperty("driver_class");
                String url = prop.getProperty("url");
                String dbUsername = prop.getProperty("username");
                String dbPassword = prop.getProperty("password");
                Class.forName(Driver);
                System.out.println("Driver Registered");

                connection = DriverManager.getConnection(url, dbUsername, dbPassword);

                stmt = connection.createStatement();
                String sql;
                sql = "SELECT id, first_name, password, create_dt FROM Users";
                rs = stmt.executeQuery(sql);

                //STEP 5: Extract data from result set
                while (rs.next()) {
                    //Retrieve by column name
                    int id = rs.getInt("id");
                    String first_name = rs.getString("first_name");
                    String password = rs.getString("password");
                    Date create_dt = rs.getDate("create_dt");

                    //Display values
                    System.out.print("ID: " + id);
                    System.out.print(", First Name: " + first_name);
                    System.out.print(", password: " + password);
                    System.out.println(", create date: " + create_dt);
                }

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            } catch (SQLException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            } finally {
                try {
                    if (rs != null) {
                        rs.close();
                    }
                    if (stmt != null) {
                        stmt.close();
                    }
                    if (connection != null) {
                        connection.close();
                    }

                } catch (SQLException e) {

                }

            }
        }


    }


}
