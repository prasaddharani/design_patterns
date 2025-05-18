package org.example.patterns.behavioral.observer;

public class BankingApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.addObserver(new EmailNotifier());
        account.addObserver(new FraudDetector());

        account.deposit(1000.0); // Both observers are notified
    }
}
