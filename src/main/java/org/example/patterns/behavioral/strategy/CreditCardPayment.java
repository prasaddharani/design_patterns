package org.example.patterns.behavioral.strategy;

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit card: " + cardNumber);
    }
}
