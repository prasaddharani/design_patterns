package org.example.patterns.behavioral.observer;

public class EmailNotifier implements AccountObserver {
    public void update(double newBalance) {
        System.out.println("Email: Your new balance is: " + newBalance);
    }
}
