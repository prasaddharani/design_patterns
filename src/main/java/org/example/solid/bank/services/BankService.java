package org.example.solid.bank.services;

import org.example.solid.bank.models.Account;
import org.example.solid.bank.models.Party;
import org.example.solid.bank.repository.AccountRepository;
import org.example.solid.bank.repository.PartyRepository;

public class BankService {
    private AccountRepository accountRepository;
    private PartyRepository partyRepository;

    public BankService(AccountRepository accountRepository, PartyRepository partyRepository) {
        this.accountRepository = accountRepository;
        this.partyRepository = partyRepository;
    }

    public void createParty(Party party) {
        partyRepository.addParty(party);
    }

    public void createAccount(Account account) {
        accountRepository.addAccount(account);
    }
}
