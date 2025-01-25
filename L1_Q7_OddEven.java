import java.util.Scanner;

public class L1_Q7_OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Error: Please enter a natural number greater than 0.");
            return;
        }

        int[] odd = new int[number / 2 + 1];
        int[] even = new int[number / 2 + 1];
        int n1 = 0, n2 = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[n2++] = i;
            } else {
                odd[n1++] = i;
            }
        }

        System.out.print("Odd numbers: ");
        for (int i = 0; i < n1; i++) {
            System.out.print(odd[i] + " ");
        }

        System.out.print("\nEven numbers: ");
        for (int i = 0; i < n2; i++) {
            System.out.print(even[i] + " ");
        }

    }
}
