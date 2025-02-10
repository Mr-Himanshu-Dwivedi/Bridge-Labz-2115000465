import java.util.List;
import java.util.ArrayList;

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {
    private String productId;
    private String name;
    private double price;

    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative.");
        }
    }

    public abstract double calculateDiscount();
}

class Electronics extends Product implements Taxable {
    private double discountRate;

    public Electronics(String productId, String name, double price, double discountRate) {
        super(productId, name, price);
        this.discountRate = discountRate;
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate / 100;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.15; // Assuming 15% tax for electronics
    }

    @Override
    public String getTaxDetails() {
        return "Tax rate for Electronics: 15%";
    }
}

class Clothing extends Product implements Taxable {
    private double discountAmount;

    public Clothing(String productId, String name, double price, double discountAmount) {
        super(productId, name, price);
        this.discountAmount = discountAmount;
    }

    @Override
    public double calculateDiscount() {
        return discountAmount;
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.10; // Assuming 10% tax for clothing
    }

    @Override
    public String getTaxDetails() {
        return "Tax rate for Clothing: 10%";
    }
}

class Groceries extends Product {
    private boolean isOrganic;

    public Groceries(String productId, String name, double price, boolean isOrganic) {
        super(productId, name, price);
        this.isOrganic = isOrganic;
    }

    @Override
    public double calculateDiscount() {
        return isOrganic ? getPrice() * 0.05 : 0; // 5% discount for organic groceries
    }
}

public class Q2_ECommercePlatform {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        Electronics electronics = new Electronics("E001", "Laptop", 1000.00, 10);
        Clothing clothing = new Clothing("C001", "T-shirt", 20.00, 5);
        Groceries groceries = new Groceries("G001", "Apple", 3.00, true);

        products.add(electronics);
        products.add(clothing);
        products.add(groceries);

        for (Product product : products) {
            double discount = product.calculateDiscount();
            double priceAfterDiscount = product.getPrice() - discount;
            double tax = 0;

            if (product instanceof Taxable) {
                Taxable taxableProduct = (Taxable) product;
                tax = taxableProduct.calculateTax();
                System.out.println(taxableProduct.getTaxDetails());
            }

            double finalPrice = priceAfterDiscount + tax;

            System.out.printf("Product: %s\nPrice: %.2f\nDiscount: %.2f\nTax: %.2f\nFinal Price: %.2f\n\n",
                    product.getName(), product.getPrice(), discount, tax, finalPrice);
        }
    }
}
