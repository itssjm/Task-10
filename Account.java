package Task.Task_10;

public class Account {
    // Data member
    private double balance;

    // No-argument constructor
    public Account() {
        this.balance = 0.0;
    }

    // Constructor with two arguments
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit balance
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid amount for deposit.");
        }
    }

    // Method to withdraw balance
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance for withdrawal.");
        } else {
            System.out.println("Invalid amount for withdrawal.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating an account object with no initial balance
        Account account1 = new Account();
        System.out.println("Account 1 Balance: " + account1.balance);

        // Depositing into account1
        account1.deposit(1000);

        // Withdrawal from account1
        account1.withdraw(500);

        // Creating an account object with initial balance
        Account account2 = new Account(2000);
        System.out.println("Account 2 Balance: " + account2.balance);

        // Withdrawal from account2
        account2.withdraw(3000);
    }
}


