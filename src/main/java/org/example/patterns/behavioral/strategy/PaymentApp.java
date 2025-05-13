package org.example.patterns.behavioral.strategy;

public class PaymentApp {

    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        // Pay using Credit Card
        paymentContext.setPaymentStrategy(new CreditCardPayment("12345"));
        paymentContext.pay(1000);

        // Pay using PayPal
        paymentContext.setPaymentStrategy(new PayPalPayment("test@gmail.com"));
        paymentContext.pay(2000);
    }

}
