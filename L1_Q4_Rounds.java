import java.util.Scanner;

public class L1_Q4_Rounds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1 of the triangle (in meters): ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side 2 of the triangle (in meters): ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side 3 of the triangle (in meters): ");
        double side3 = sc.nextDouble();

        int rounds = Rounds(side1, side2, side3);

        System.out.println("Number of rounds to complete 5 km run: " + rounds);
    }

    public static int Rounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double distance = 5000; // 5 km in meters
        return (int) Math.ceil(distance / perimeter);    }
}