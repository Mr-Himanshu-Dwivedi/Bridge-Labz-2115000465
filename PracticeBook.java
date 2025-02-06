import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        title = "Unknown";
        author = "Unknown";
        price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayBookDetails() {
        System.out.printf("Title: %s, Author: %s, Price: %.2f\n", title, author, price);
    }
}

public class PracticeBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book defaultBook = new Book();
        defaultBook.displayBookDetails();

        System.out.print("Enter title: ");
        String title = sc.nextLine();
        System.out.print("Enter author: ");
        String author = sc.nextLine();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        Book paraBook = new Book(title, author, price);
        paraBook.displayBookDetails();
    }
}
