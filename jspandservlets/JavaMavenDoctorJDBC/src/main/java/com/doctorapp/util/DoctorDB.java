package com.doctorapp.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DoctorDB {

    static Connection connection;
    private static String url = "jdbc:mysql://localhost:3306/voyatraining";
//    private static String url = "jdbc:mysql://localhost:3306/newvoya";
    private static String username = "root";
    private static String password = "root";
    public static Connection openConnetion() {
        System.out.println("Opening JDBC");
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database connected");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

}
