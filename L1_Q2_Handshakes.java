import java.util.Scanner;

public class L1_Q2_Handshakes {

    public static int handshakes(int n) {
        return (n * (n - 1)) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int students = sc.nextInt();
        int handshakes = handshakes(students);

        System.out.println("Maximum number of handshakes: " + handshakes);
    }
}