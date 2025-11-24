package org.example.patterns.structual.fascade;

public class OnboardingFascade {
    private final AccountService accountService;
    private final AddressService addressService;
    private final EmailService emailService;
    private final KafkaService kafkaService;

    OnboardingFascade(AccountService accountService, AddressService addressService,
                      EmailService emailService, KafkaService kafkaService) {
        this.accountService = accountService;
        this.addressService = addressService;
        this.emailService = emailService;
        this.kafkaService = kafkaService;
    }

    public void onboardClient() {
        accountService.createAccount();
        addressService.createAddress();
        emailService.sendEmail("Welcome");
        kafkaService.publishMessage();
    }
}
