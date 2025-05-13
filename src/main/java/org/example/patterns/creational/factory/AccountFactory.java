package org.example.patterns.creational.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class AccountFactory {
    public static Map<String, Function<String, Account>> accountCreators = new HashMap<>();

    static {
        registerAccount("Savings", SavingsAccount::new);
        registerAccount("Current", CurrentAccount::new);
    }

    public static void registerAccount(
            String accountType, Function<String, Account> creator) {
        accountCreators.put(accountType, creator);
    }

    public static Account createAccount(String accountType, String accountId) {
        Function<String, Account> creator = accountCreators.get(accountType);
        if (creator != null) {
            return creator.apply(accountId);
        }
        throw new IllegalArgumentException("Invalid account type: " + accountType);
    }
}
