package org.example.patterns.creational.factory;

public class SavingsAccount extends Account {
    SavingsAccount (String accountId) {
        super(accountId, "Savings");
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("Savings Account: " + getAccountId());
    }
}
