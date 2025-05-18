package org.example.patterns.behavioral.observer;

public class FraudDetector implements AccountObserver {
    @Override
    public void update(double newBalance) {
        System.out.println("Fraud Detector: Balance changed to " + newBalance);
    }
}
