import java.util.Scanner;

public class Extras_Q8_TempConvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = getChoice();

        if (choice == 1) {
            double fahrenheit = getInput("Enter temperature in Fahrenheit: ");
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.println(fahrenheit + " Fahrenheit = " + celsius + " Celsius");
        } else if (choice == 2) {
            double celsius = getInput("Enter temperature in Celsius: ");
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.println(celsius + " Celsius = " + fahrenheit + " Fahrenheit");
        } else {
            System.out.println("Invalid choice.");
        }
    }

    public static int getChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Enter your choice: ");
        return sc.nextInt();
    }

    public static double getInput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextDouble();
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
}
