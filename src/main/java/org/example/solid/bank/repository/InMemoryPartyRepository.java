package org.example.solid.bank.repository;

import org.example.solid.bank.models.Party;

import java.util.ArrayList;
import java.util.List;

public class InMemoryPartyRepository implements PartyRepository {
    List<Party> parties = new ArrayList<>();
    
    @Override
    public void addParty(Party party) {
        parties.add(party);
    }

    @Override
    public Party findPartyById(String partyId) {
        return parties.stream()
                .filter(party -> partyId.equals(party.getPartyId()))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Party> getAllParties() {
        return new ArrayList<>(parties);
    }
}
