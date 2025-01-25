import java.util.Scanner;

public class L1_Q1_Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        for (int age : ages) {
            if (age < 0) {
                System.out.print("an invalid age");
            } else if (age >= 18) {
                System.out.printf("The student with the age %d can vote.\n", age);
            } else {
                System.out.printf("The student with the age %d cannot vote.\n", age);
            }
        }

    }
}
