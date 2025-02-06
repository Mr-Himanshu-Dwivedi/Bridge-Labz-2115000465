class Product {
    private String productName;
    private double price;
    private static int totalProducts = 0;  // Class variable shared among all instances

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;  // Increment totalProducts each time a new product is created
    }

    public void displayProductDetails() {
        System.out.printf("Product Name: %s, Price: %.2f\n", productName, price);
    }

    public static void displayTotalProducts() {
        System.out.println("Total products created: " + totalProducts);
    }
}

public class ProductInventory {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 800.50);
        p1.displayProductDetails();

        Product p2 = new Product("Smartphone", 500.99);
        p2.displayProductDetails();

        Product p3 = new Product("Tablet", 300.75);
        p3.displayProductDetails();

        Product.displayTotalProducts();  // Call the class method to show total products created
    }
}
