package org.example.solid.bank.models;

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

    @Override
    public String toString() {
        return super.toString();
    }
}
