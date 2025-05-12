package org.example.solid.bank.repository;

import org.example.solid.bank.models.Account;

import java.util.ArrayList;
import java.util.List;

public class InMemoryAccountRepository implements AccountRepository {
    List<Account> accounts = new ArrayList<>();

    @Override
    public void addAccount(Account account) {
        accounts.add(account);
    }

    @Override
    public Account findAccountById(String accountId) {
        return accounts.stream()
                .filter(account -> accountId.equals(account.getAccountId()))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Account> getAccounts() {
        return new ArrayList<>(accounts);
    }
}
