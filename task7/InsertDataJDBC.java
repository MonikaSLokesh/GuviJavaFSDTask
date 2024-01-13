//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InsertDataJDBC {
    static final String URL = "jdbc:mysql://localhost:3306/employee?useSSL=false";
    static final String USER = "root";
    static final String PWD = "L27m24td05@2023";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String insertQuery = "INSERT INTO employee (empcode, empname, empage, esalary) VALUES (?, ?, ?, ?)";

        try (
                Connection connection = DriverManager.getConnection(URL, USER, PWD);
                PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)
        ) {
            insertEmployee(preparedStatement, 101, "Jenny", 25, 10000);
            
            insertEmployee(preparedStatement, 102, "Jacky", 30, 20000);
            insertEmployee(preparedStatement, 103, "Joe", 20, 40000);
            insertEmployee(preparedStatement, 104, "John", 40, 80000);
            insertEmployee(preparedStatement, 105, "Shameer", 25, 90000);


            System.out.println("Data inserted successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void insertEmployee(PreparedStatement preparedStatement, int empcode, String empname, int empage, int esalary) throws SQLException {
        preparedStatement.setInt(1, empcode);
        preparedStatement.setString(2, empname);
        preparedStatement.setInt(3, empage);
        preparedStatement.setInt(4, esalary);
        preparedStatement.executeUpdate();
    }
}
