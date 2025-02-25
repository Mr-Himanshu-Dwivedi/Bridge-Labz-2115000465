package com.lcwd.test;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q4_FilterStudents {
    public static void main(String[] args) {
        String filePath = "data2.csv";
        createCSVFile(filePath);
        filterHighScoringStudents(filePath);
    }

    private static void createCSVFile(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {
                String[] header = {"ID", "Name", "Age", "Marks"};
                String[] student1 = {"1", "Himanshu", "21", "80"};
                String[] student2 = {"2", "Ayush", "22", "74"};
                String[] student3 = {"3", "Kartikey", "23", "83"};
                String[] student4 = {"4", "Krishna", "22", "58"};
                String[] student5 = {"5", "Rajat", "20", "985"};

                writer.writeNext(header);
                writer.writeNext(student1);
                writer.writeNext(student2);
                writer.writeNext(student3);
                writer.writeNext(student4);
                writer.writeNext(student5);

                System.out.println("CSV file created successfully: " + file.getAbsolutePath());
            } catch (IOException e) {
                System.out.println("Error creating CSV file.");
                e.printStackTrace();
            }
        } else {
            System.out.println("CSV file already exists: " + file.getAbsolutePath());
        }
    }

    private static void filterHighScoringStudents(String filePath) {
        System.out.println("Students who scored more than 80 marks:");
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] nextLine;
            reader.readNext();
            while ((nextLine = reader.readNext()) != null) {
                int marks = Integer.parseInt(nextLine[3]);
                if (marks > 80) {
                    System.out.println(nextLine[0] + " | " + nextLine[1] + " | " + nextLine[2] + " | " + nextLine[3]);
                }
            }
        } catch (IOException | CsvValidationException e) {
            System.out.println("Error reading CSV file.");
            e.printStackTrace();
        }
    }
}
