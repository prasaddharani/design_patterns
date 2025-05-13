package org.example.patterns.builder;

import org.example.patterns.factory.Account;

public class BankAccount {
    private String accountId;
    private String accountType;
    private String ownerName;
    private double balance;
    private Address address;

    BankAccount(Builder builder) {
        this.accountId = builder.accountId;
        this.accountType = builder.accountType;
        this.ownerName = builder.ownerName;
        this.balance = builder.balance;
        this.address = builder.address;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String accountId;
        private String accountType;
        private String ownerName;
        private double balance;
        private Address address;

        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        public Builder accountType(String accountType) {
            this.accountType = accountType;
            return this;
        }

        public Builder ownerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }

        public Builder balance(double balance) {
            this.balance = balance;
            return this;
        }

        public Builder address(Address address) {
            this.address = address;
            return this;
        }

        public BankAccount build() {
            return new BankAccount(this);
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountId='" + accountId + '\'' +
                ", accountType='" + accountType + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", balance=" + balance +
                ", address=" + address +
                '}';
    }
}
