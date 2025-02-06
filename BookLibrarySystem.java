class L2Book {
    public String ISBN;
    protected String title;
    private String author;

    public L2Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void displayBookDetails() {
        System.out.printf("ISBN: %s, Title: %s, Author: %s\n", ISBN, title, author);
    }
}

class EBook extends L2Book {
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    public void displayEBookDetails() {
        System.out.printf("EBook - ISBN: %s, Title: %s, Author: %s\n", ISBN, title, getAuthor());
    }
}

public class BookLibrarySystem {
    public static void main(String[] args) {
        L2Book book1 = new L2Book("978-1234567890", "Java Programming", "John Doe");
        book1.displayBookDetails();

        book1.setAuthor("Jane Smith");
        System.out.println("\nAfter updating author:");
        book1.displayBookDetails();

        EBook eBook1 = new EBook("978-0987654321", "Learning Python", "Alice Brown");
        eBook1.displayEBookDetails();
    }
}
