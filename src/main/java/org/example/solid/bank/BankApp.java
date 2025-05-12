package org.example.solid.bank;

import org.example.solid.bank.models.Account;
import org.example.solid.bank.models.CurrentAccount;
import org.example.solid.bank.models.Party;
import org.example.solid.bank.models.SavingsAccount;
import org.example.solid.bank.repository.AccountRepository;
import org.example.solid.bank.repository.InMemoryAccountRepository;
import org.example.solid.bank.repository.InMemoryPartyRepository;
import org.example.solid.bank.repository.PartyRepository;
import org.example.solid.bank.services.BankService;

public class BankApp {

    public static void main(String[] args) {
        AccountRepository accountRepository = new InMemoryAccountRepository();
        PartyRepository partyRepository = new InMemoryPartyRepository();
        BankService bankService = new BankService(accountRepository, partyRepository);

        // Create accounts
        Account savingsAccount = new SavingsAccount("A001");
        Account currentAccount = new CurrentAccount("A002");
        bankService.createAccount(savingsAccount);
        bankService.createAccount(currentAccount);

        // Create parties
        Party party1 = new Party("P001", "John Doe");
        Party party2 = new Party("P002", "Jane Smith");
        bankService.createParty(party1);
        bankService.createParty(party2);

        System.out.println("Bank application executed successfully.");
    }
}
