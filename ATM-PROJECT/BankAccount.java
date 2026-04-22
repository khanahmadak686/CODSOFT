public class BankAccount {

    private double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("✅ Amount deposited successfully.");
        } else {
            System.out.println("❌ Invalid amount.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("✅ Withdrawal successful.");
        } else {
            System.out.println("❌ Insufficient balance or invalid amount.");
        }
    }

    // Check balance
    public double getBalance() {
        return balance;
    }
}