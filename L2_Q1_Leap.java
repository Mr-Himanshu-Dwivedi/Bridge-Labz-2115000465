import java.util.Scanner;

public class L2_Q1_Leap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        // Check if the year is valid (greater than or equal to 1582)
        if (year >= 1582) {
            // Check if the year is divisible by 4
            if (year % 4 == 0) {
                // Check if the year is divisible by 100
                if (year % 100 == 0) {
                    // Check if the year is divisible by 400
                    if (year % 400 == 0) {
                        System.out.println(year + " is a Leap Year.");
                    } else {
                        System.out.println(year + " is not a Leap Year.");
                    }
                } else {
                    System.out.println(year + " is a Leap Year.");
                }
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        } else {
            System.out.println("Year must be 1582 or later.");
        }
    }
}
