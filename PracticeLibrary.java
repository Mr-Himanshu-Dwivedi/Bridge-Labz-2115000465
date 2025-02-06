import java.util.Scanner;

class LBook {
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    public LBook(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    public void displayBookDetails() {
        System.out.printf("Title: %s, Author: %s, Price: %.2f, Available: %b\n", title, author, price, isAvailable);
    }
}

public class PracticeLibrary{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter title: ");
        String title = sc.nextLine();
        System.out.print("Enter author: ");
        String author = sc.nextLine();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        System.out.print("Enter availability (true/false): ");
        boolean isAvailable = sc.nextBoolean();

        LBook book = new LBook(title, author, price, isAvailable);
        book.displayBookDetails();
        book.borrowBook();
        book.displayBookDetails();
    }
}
