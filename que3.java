import java.util.Scanner;
class que3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temp in Celsius ");
        double Celsius = sc.nextDouble();
        double Fahrenheit = (Celsius * 9/5) + 32;
        System.out.println(Fahrenheit);
    }
}