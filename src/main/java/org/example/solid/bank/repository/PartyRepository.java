package org.example.solid.bank.repository;

import org.example.solid.bank.models.Party;

import java.util.List;

public interface PartyRepository {
    void addParty(Party party);

    Party findPartyById(String partyId);

    List<Party> getAllParties();

}
