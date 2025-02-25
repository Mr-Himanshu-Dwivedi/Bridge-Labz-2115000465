package com.lcwd.test;

import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Q2_WriteData {
    public static void main(String[] args) {
        String filePath = "data.csv";
        writeCSVFile(filePath);
    }

    private static void writeCSVFile(String filePath) {
        try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
            String[] emp1 = {"1", "Himanshu", "Engineering", "120000"};
            String[] emp2 = {"2", "Ayush", "HR", "57000"};
            String[] emp3 = {"3", "Kartikey", "Marketing", "52000"};
            String[] emp4 = {"4", "Krishna", "Development", "45000"};
            String[] emp5 = {"5", "Rajat", "Finance", "40000"};

            writer.writeNext(emp1);
            writer.writeNext(emp2);
            writer.writeNext(emp3);
            writer.writeNext(emp4);
            writer.writeNext(emp5);

            System.out.println("CSV file written successfully!");
        } catch (IOException e) {
            System.out.println("Error writing CSV file.");
            e.printStackTrace();
        }
    }
}
