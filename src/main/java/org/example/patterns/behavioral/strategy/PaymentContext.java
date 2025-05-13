package org.example.patterns.behavioral.strategy;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(double amount) {
        if (paymentStrategy == null) {
            throw new IllegalArgumentException("Payment strategy not set");
        }
        paymentStrategy.pay(amount);
    }
}
