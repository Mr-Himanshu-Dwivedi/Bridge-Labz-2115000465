package com.lcwd.test;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import java.io.*;
import java.util.*;

public class Q7_SortRecord {
    public static void main(String[] args) {
        String filePath = "employees4.csv";

        createCSVFile(filePath);
        sortAndPrintTopSalaries(filePath);
    }

    private static void createCSVFile(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
                String[] header = {"ID", "Name", "Department", "Salary"};
                String[] emp1 = {"1", "Himanshu", "Engineering", "120000"};
                String[] emp2 = {"2", "Ayush", "HR", "57000"};
                String[] emp3 = {"3", "Kartikey", "Marketing", "52000"};
                String[] emp4 = {"4", "Krishna", "Development", "45000"};
                String[] emp5 = {"5", "Rajat", "Finance", "40000"};
                String[] emp6 = {"6", "Sarad", "HR", "72000"};
                String[] emp7 = {"7", "Munna", "Sales", "68000"};

                writer.writeNext(header);
                writer.writeNext(emp1);
                writer.writeNext(emp2);
                writer.writeNext(emp3);
                writer.writeNext(emp4);
                writer.writeNext(emp5);
                writer.writeNext(emp6);
                writer.writeNext(emp7);

                System.out.println("CSV file created successfully: " + file.getAbsolutePath());
            } catch (IOException e) {
                System.out.println("Error creating CSV file.");
                e.printStackTrace();
            }
        } else {
            System.out.println("CSV file already exists: " + file.getAbsolutePath());
        }
    }

    private static void sortAndPrintTopSalaries(String filePath) {
        List<String[]> data = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] header = reader.readNext();
            String[] nextLine;

            while ((nextLine = reader.readNext()) != null) {
                data.add(nextLine);
            }

            data.sort((a, b) -> Integer.parseInt(b[3]) - Integer.parseInt(a[3]));

            System.out.println("\nTop 5 Highest Paid Employees:");
            System.out.println("ID\tName\t\tDepartment\tSalary");
            System.out.println("--------------------------------------");

            for (int i = 0; i < Math.min(5, data.size()); i++) {
                System.out.println(data.get(i)[0] + "\t" + data.get(i)[1] + "\t" + data.get(i)[2] + "\t" + data.get(i)[3]);
            }

        } catch (IOException | CsvValidationException e) {
            System.out.println("Error reading CSV file.");
            e.printStackTrace();
        }
    }
}
