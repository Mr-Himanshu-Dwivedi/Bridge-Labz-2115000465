import java.util.Scanner;
public class selfque5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distance in kilometers: " );
        int k=sc.nextInt();
        double miles=k*0.621371;
        System.out.println(miles);
    }
}