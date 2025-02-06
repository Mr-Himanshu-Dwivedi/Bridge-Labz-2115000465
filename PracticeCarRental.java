import java.util.Scanner;

class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double rentalCost;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.rentalCost = rentalDays * 50.0;  // Assuming $50 per day
    }

    public void displayRentalDetails() {
        System.out.printf("Customer: %s, Car Model: %s, Rental Days: %d, Total Cost: %.2f\n", customerName, carModel, rentalDays, rentalCost);
    }
}

public class PracticeCarRental {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customerName = sc.nextLine();
        System.out.print("Enter car model: ");
        String carModel = sc.nextLine();
        System.out.print("Enter number of rental days: ");
        int rentalDays = sc.nextInt();

        CarRental rental = new CarRental(customerName, carModel, rentalDays);
        rental.displayRentalDetails();
    }
}
