package org.example.solid.bank.models;

public class Party {
    private String partyId;
    private String name;

    public Party(String partyId, String name) {
        this.partyId = partyId;
        this.name = name;
    }

    public String getPartyId() {
        return partyId;
    }

    public String getName() {
        return name;
    }
}
