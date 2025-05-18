package org.example.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private double newBalance;
    private List<AccountObserver> observers = new ArrayList<>();

    public void addObserver(AccountObserver observer) {
        observers.add(observer);
    }

    public void deposit(double amount) {
        newBalance += amount;
        notifyObservers();
    }

    public void notifyObservers() {
        observers.forEach(observer -> observer.update(newBalance));
    }

}
