package org.example.patterns.structual.fascade;

class AccountService {
    public void createAccount() {
        System.out.println("Account created");
    }
}

class AddressService {
    public void createAddress() {
        System.out.println("Address created");
    }
}

class EmailService {
    public void sendEmail(String message) {
        System.out.println(message + " email sent");
    }
}

class KafkaService {
    public void publishMessage() {
        System.out.println("Published messsage for downstream");
    }
}


public class Services {
}
