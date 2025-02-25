
package com.lcwd.test;
import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;

public class Q13_GenerateCsvReportFromDatabase {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/company";
        String dbUser = "root";
        String dbPassword = "password";
        String csvFilePath = "employees.csv";

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/", dbUser, dbPassword);
             Statement statement = connection.createStatement()) {

            statement.executeUpdate("CREATE DATABASE IF NOT EXISTS company");
            statement.executeUpdate("USE company");

            String createTableSQL = "CREATE TABLE IF NOT EXISTS employees (" +
                    "id INT PRIMARY KEY, " +
                    "name VARCHAR(50), " +
                    "department VARCHAR(50), " +
                    "salary DECIMAL(10,2))";
            statement.executeUpdate(createTableSQL);

            String checkData = "SELECT COUNT(*) FROM employees";
            try (ResultSet rs = statement.executeQuery(checkData)) {
                if (rs.next() && rs.getInt(1) == 0) {
                    String insertData = "INSERT INTO employees (id, name, department, salary) VALUES " +
                            "(1, 'Himanshu', 'IT', 60000), " +
                            "(2, 'Ayush', 'HR', 50000), " +
                            "(3, 'Kartikey', 'Finance', 55000), " +
                            "(4, 'Krishna', 'Marketing', 65000), " +
                            "(5, 'Rajat', 'Development', 70000)";
                    statement.executeUpdate(insertData);
                }
            }


            try (ResultSet resultSet = statement.executeQuery("SELECT * FROM employees");
                 CSVWriter csvWriter = new CSVWriter(new FileWriter(csvFilePath))) {


                String[] header = {"Employee ID", "Name", "Department", "Salary"};
                csvWriter.writeNext(header);


                while (resultSet.next()) {
                    String[] row = {
                            String.valueOf(resultSet.getInt("id")),
                            resultSet.getString("name"),
                            resultSet.getString("department"),
                            String.valueOf(resultSet.getDouble("salary"))
                    };
                    csvWriter.writeNext(row);
                }

                System.out.println("CSV file created successfully: " + csvFilePath);
            }
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
}
