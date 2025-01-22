import java.util.Scanner;

public class L2_Q3_DoubleOpt {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the base of the triangle in inches: ");
        double base = sc.nextDouble();


        System.out.print("Enter the height of the triangle in inches: ");
        double heightInInches = sc.nextDouble();


        double areaInSquareInches = 0.5 * base * heightInInches;
        double areaInSquareCentimeters = areaInSquareInches * 6.4516;


        double heightInCm = heightInInches * 2.54;
        double heightInFeet = heightInInches / 12;


        System.out.println("Area of the triangle in square inches: " + areaInSquareInches);
        System.out.println("Area of the triangle in square centimeters: " + areaInSquareCentimeters);
        System.out.println("Height in cm is " + heightInCm + " while in feet is " + heightInFeet + " and inches is " + heightInInches);
    }

}
