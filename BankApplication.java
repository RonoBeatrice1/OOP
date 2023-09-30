import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private double balance;

 // Constructor to initialize a bank account with an account number
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

 // This method allows the user to deposit funds into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount; // Add the deposited amount to the balance
            System.out.println("Deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

// This method allows the user to withdraw funds from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount; // Subtract the withdrawn amount from the balance
            System.out.println("Withdrawn $" + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

// This method returns the current balance of the account
    public double getBalance() {
        return balance;
    }
}

public class BankApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your account number: ");
        String accountNumber = scanner.next();

        BankAccount account = new BankAccount(accountNumber);

        while (true) {
            System.out.println("\nBank Account Menu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter the withdrawal amount: $");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;
                case 3:
                    System.out.println("Current Balance: $" + account.getBalance());
                    break;
                case 4:
                    System.out.println("Thank you for using the bank application?.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
