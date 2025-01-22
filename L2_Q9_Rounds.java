import java.util.Scanner;

public class L2_Q9_Rounds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter side 1 (in meters): ");
        double side1 = sc.nextDouble();


        System.out.print("Enter side 2 (in meters): ");
        double side2 = sc.nextDouble();


        System.out.print("Enter side 3 (in meters): ");
        double side3 = sc.nextDouble();


        double perimeter = side1 + side2 + side3;
        double distanceToRun = 5000;
        double rounds = distanceToRun / perimeter;


        System.out.println("The total number of rounds the athlete will run is " + Math.ceil(rounds) + " to complete 5 km");
    }

}
