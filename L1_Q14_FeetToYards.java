import java.util.Scanner;

public class L1_Q14_FeetToYards {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();


        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;


        System.out.println("The distance in yards is: %.2f yards\n"+ distanceInYards);
        System.out.println("The distance in miles is: %.2f miles\n"+ distanceInMiles);
    }

}
