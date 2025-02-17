import java.io.*;
import java.util.Random;

public class FileGenerator {

    public static void main(String[] args) {
        String filePath1MB = "1MB.txt";
        String filePath100MB = "100MB.txt";
        String filePath500MB = "500MB.txt";

        // Generate files of 1MB, 100MB, and 500MB
        generateLargeFile(filePath1MB, 1 * 1024 * 1024);   // 1MB
        generateLargeFile(filePath100MB, 100 * 1024 * 1024); // 100MB
        generateLargeFile(filePath500MB, 500 * 1024 * 1024); // 500MB

        System.out.println("Large files generated!");
    }

    // Generate a file with random characters of a specified size in bytes
    public static void generateLargeFile(String filePath, long fileSizeInBytes) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            Random random = new Random();
            long writtenBytes = 0;

            while (writtenBytes < fileSizeInBytes) {
                char randomChar = (char) (random.nextInt(26) + 'a'); // Random lowercase letter
                writer.write(randomChar);
                writtenBytes++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
