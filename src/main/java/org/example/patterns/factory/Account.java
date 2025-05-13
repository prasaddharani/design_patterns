package org.example.patterns.factory;

public abstract class Account {

    private String accountId;
    private String accountType;

    public Account(String accountId, String accountType) {
        this.accountId = accountId;
        this.accountType = accountType;
    }

    public String getAccountId() {
        return accountId;
    }

    public String getAccountType() {
        return accountType;
    }

    public abstract void displayAccountDetails();
}
