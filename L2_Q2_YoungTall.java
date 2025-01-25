import java.util.Scanner;

public class L2_Q2_YoungTall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            age[i] = sc.nextInt();

            System.out.print("Enter height of " + friends[i] + ": ");
            height[i] = sc.nextDouble();
        }

        int young = 0;
        int tall = 0;

        for (int i = 1; i < 3; i++) {
            if (age[i] < age[young]) {
                young = i;
            }

            if (height[i] > height[tall]) {
                tall = i;
            }
        }

        System.out.println("The youngest friend is " + friends[young] + " with age " + age[young]);
        System.out.println("The tallest friend is " + friends[tall] + " with height " + height[tall]);

    }
}
