class Vehicle {
    private String ownerName;
    private String vehicleType;
    private static double registrationFee = 150.00;  // Class variable shared among all vehicles

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public void displayVehicleDetails() {
        System.out.printf("Owner Name: %s, Vehicle Type: %s, Registration Fee: %.2f\n",
                ownerName, vehicleType, registrationFee);
    }

    public static void updateRegistrationFee(double newRegistrationFee) {
        registrationFee = newRegistrationFee;  // Update the class variable
    }
}

public class VehicleRegistration {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("John Doe", "Car");
        Vehicle vehicle2 = new Vehicle("Jane Smith", "Motorcycle");
        Vehicle vehicle3 = new Vehicle("Alice Brown", "Truck");

        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
        vehicle3.displayVehicleDetails();

        // Update the registration fee for all vehicles
        Vehicle.updateRegistrationFee(200.00);

        System.out.println("\nAfter updating registration fee:\n");

        vehicle1.displayVehicleDetails();
        vehicle2.displayVehicleDetails();
        vehicle3.displayVehicleDetails();
    }
}
