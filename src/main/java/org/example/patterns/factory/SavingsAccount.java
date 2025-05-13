package org.example.patterns.factory;

public class SavingsAccount extends Account {
    SavingsAccount (String accountId) {
        super(accountId, "Savings");
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("Savings Account: " + getAccountId());
    }
}
