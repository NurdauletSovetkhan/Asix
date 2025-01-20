package Assignment2.task2;

import java.text.NumberFormat;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String accountHolderName;

    NumberFormat nF = NumberFormat.getCurrencyInstance();

    public BankAccount(String accountHolderName, int accountNumber, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // === Methods ===
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Congrats! You deposited " + nF.format(amount) + " to " + accountHolderName);
        } else{
            throw new IllegalArgumentException("Hey! You can't deposit negative number :(");
        }
    }

    public void withdraw(double amount) throws IllegalArgumentException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Sum should be greater than 0!");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Not enough money!");
        }
        balance -= amount;
        System.out.println("You withdrawn " + nF.format(amount));
    }


    // === Printer ===
    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("Account Holder Name: " + accountHolderName);
    }

}
