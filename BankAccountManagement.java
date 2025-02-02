class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void displayAccountDetails() {
        System.out.printf("Account Number: %s, Account Holder: %s, Balance: %.2f\n", accountNumber, accountHolder, balance);
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void displaySavingsAccountDetails() {
        System.out.printf("Savings Account - Account Number: %s, Account Holder: %s, Balance: %.2f\n", accountNumber, accountHolder, getBalance());
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("12345", "John Doe", 1500.00);
        account1.displayAccountDetails();

        account1.setBalance(1800.00);
        System.out.println("\nAfter updating balance:");
        account1.displayAccountDetails();

        SavingsAccount savings1 = new SavingsAccount("67890", "Jane Smith", 5000.00);
        savings1.displaySavingsAccountDetails();
    }
}
