import java.util.Scanner;

public class L1_Q6_PlayerHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;

        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
            sum += heights[i];
        }

        double mean = sum / heights.length;

        System.out.printf("The mean height of the football team is: %.2f\n", mean);
    }
}
