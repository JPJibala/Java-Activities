package BankingApp;

import java.util.Scanner;

class BankAccount {
    private int userId;
    private int pin;
    private String name;
    private double balance;

    // Constructor to initialize the bank account details
    public BankAccount(int userId, int pin, String name, double balance) {
        this.userId = userId;
        this.pin = pin;
        this.name = name;
        this.balance = balance;
    }

    // Getter methods
    public int getUserId() {
        return userId;
    }

    public int getPin() {
        return pin;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    // Method to check balance
    public void checkBalance() {
        System.out.println("Current balance: " + balance);
    }

    // Method to add cash
    public void addCash(double amount) {
        balance += amount;
        System.out.println("Amount added: " + amount);
        checkBalance();
    }

    // Method to transfer money
    public void transferMoney(BankAccount recipient, double amount) {
        if (balance >= amount) {
            balance -= amount;
            recipient.addCash(amount);
            System.out.println("Transferred " + amount + " to " + recipient.getName());
            checkBalance();
        } else {
            System.out.println("Insufficient balance for transfer.");
        }
    }
}

public class BankingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create bank accounts
        BankAccount user1 = new BankAccount(412435, 7452, "Chris Sandoval", 32000);
        BankAccount user2 = new BankAccount(264863, 1349, "Marc Yim", 1000);

        // Welcome message
        System.out.println("Welcome to the Banking App!");

        // Login process
        System.out.print("Enter user ID: ");
        int userIdInput = scanner.nextInt();
        System.out.print("Enter PIN: ");
        int pinInput = scanner.nextInt();

        // Check if the login details are correct
        BankAccount loggedInUser = null;
        if (user1.getUserId() == userIdInput && user1.getPin() == pinInput) {
            loggedInUser = user1;
        } else if (user2.getUserId() == userIdInput && user2.getPin() == pinInput) {
            loggedInUser = user2;
        }

        if (loggedInUser == null) {
            System.out.println("Invalid login details.");
            return;
        }

        System.out.println("Login successful. Welcome " + loggedInUser.getName());

        // Banking options menu
        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Check Balance");
            System.out.println("2. Cash-in (Add Money)");
            System.out.println("3. Money Transfer");
            System.out.println("4. Exit");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    loggedInUser.checkBalance();
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    loggedInUser.addCash(depositAmount);
                    break;

                case 3:
                    System.out.print("Enter recipient user ID: ");
                    int recipientId = scanner.nextInt();
                    BankAccount recipient = null;

                    // Find the recipient account
                    if (user1.getUserId() == recipientId) {
                        recipient = user1;
                    } else if (user2.getUserId() == recipientId) {
                        recipient = user2;
                    }

                    if (recipient != null) {
                        System.out.print("Enter amount to transfer: ");
                        double transferAmount = scanner.nextDouble();
                        loggedInUser.transferMoney(recipient, transferAmount);
                    } else {
                        System.out.println("Invalid recipient ID.");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the Banking App!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
