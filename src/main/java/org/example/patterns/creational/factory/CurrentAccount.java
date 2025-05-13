package org.example.patterns.creational.factory;

public class CurrentAccount extends Account {
    CurrentAccount(String accountId) {
        super(accountId, "Current");
    }


    @Override
    public void displayAccountDetails() {
        System.out.println("Current Account: " + getAccountId());
    }
}
