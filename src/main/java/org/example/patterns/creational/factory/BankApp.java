package org.example.patterns.creational.factory;


public class BankApp {
    public static void main(String[] args) {
        // Create accounts using the factory
        Account savingsAccount = AccountFactory.createAccount("Savings", "A101");
        Account currentAccount = AccountFactory.createAccount("Current", "A102");

        // Display Account details
        savingsAccount.displayAccountDetails();
        currentAccount.displayAccountDetails();
    }
}
