import java.util.Scanner;

class Circle {
    private double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void displayCircleDetails() {
        System.out.printf("Radius: %.2f\n", radius);
    }
}

public class PracticeCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Circle defaultCircle = new Circle();
        defaultCircle.displayCircleDetails();

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        Circle parameterizedCircle = new Circle(radius);
        parameterizedCircle.displayCircleDetails();
    }
}
