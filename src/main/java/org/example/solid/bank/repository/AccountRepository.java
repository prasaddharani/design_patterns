package org.example.solid.bank.repository;

import org.example.solid.bank.models.Account;

import java.util.List;

public interface AccountRepository {

    void addAccount(Account account);

    Account findAccountById(String accountId);

    List<Account> getAccounts();
}
