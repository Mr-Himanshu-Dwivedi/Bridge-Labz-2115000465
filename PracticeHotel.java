import java.util.Scanner;

class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    public HotelBooking() {
        guestName = "Unknown";
        roomType = "Standard";
        nights = 1;
    }

    public HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public void displayBookingDetails() {
        System.out.printf("Guest: %s, Room Type: %s, Nights: %d\n", guestName, roomType, nights);
    }
}

public class PracticeHotel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HotelBooking defaultBooking = new HotelBooking();
        defaultBooking.displayBookingDetails();

        System.out.print("Enter guest name: ");
        String guestName = sc.nextLine();
        System.out.print("Enter room type: ");
        String roomType = sc.nextLine();
        System.out.print("Enter number of nights: ");
        int nights = sc.nextInt();

        HotelBooking parameterizedBooking = new HotelBooking(guestName, roomType, nights);
        parameterizedBooking.displayBookingDetails();
    }
}
