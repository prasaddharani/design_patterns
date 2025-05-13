package org.example.patterns.builder;

public class BankApp {
    public static void main(String[] args) {
        Address address = Address.builder()
                .street("Durga Nagar")
                .zipCode("111111")
                .city("ABC")
                .build();
        BankAccount bankAccount =
                BankAccount.builder()
                        .accountId("A101")
                        .accountType("Savings")
                        .ownerName("Dharani")
                        .balance(1000)
                        .address(address)
                        .build();
        System.out.println(bankAccount);
    }
}
