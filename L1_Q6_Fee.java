public class L1_Q6_Fee {
    public static void main(String[] args) {
        int fee = 125000;
        int discountPercentage = 10;
        double discount = ((double)fee*(double)discountPercentage)/100;
        double amount = fee-discount;
        System.out.println("The discount amount in INR "+discount+" and final discounted fee is INR "+amount);

    }
}
