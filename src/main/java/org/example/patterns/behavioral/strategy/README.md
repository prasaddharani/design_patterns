The **Strategy Design Pattern** is a behavioral design pattern that defines a family of algorithms, encapsulates each one, and makes them interchangeable. This pattern lets the algorithm vary independently from clients that use it.

---

### Key Components
1. **Strategy Interface**: Declares a method for the algorithm.
2. **Concrete Strategies**: Implement the strategy interface with different algorithms.
3. **Context**: Maintains a reference to a strategy and allows changing it at runtime.
4. **Client**: Configures the context with a strategy.

---

### Example: Payment System

#### Step 1: Define the Strategy Interface
```java
package org.example.patterns.behavioral.strategy;

public interface PaymentStrategy {
    void pay(double amount);
}
```

#### Step 2: Implement Concrete Strategies
```java
package org.example.patterns.behavioral.strategy;

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit card: " + cardNumber);
    }
}
```

```java
package org.example.patterns.behavioral.strategy;

public class PayPalPayment implements PaymentStrategy {
    private String email;

    PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal: " + email);
    }
}
```

#### Step 3: Create the Context
```java
package org.example.patterns.behavioral.strategy;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void pay(double amount) {
        if (paymentStrategy == null) {
            throw new IllegalArgumentException("Payment strategy not set");
        }
        paymentStrategy.pay(amount);
    }
}
```

#### Step 4: Client Code
```java
package org.example.patterns.behavioral.strategy;

public class PaymentApp {

    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        // Pay using Credit Card
        paymentContext.setPaymentStrategy(new CreditCardPayment("12345"));
        paymentContext.pay(1000);

        // Pay using PayPal
        paymentContext.setPaymentStrategy(new PayPalPayment("test@gmail.com"));
        paymentContext.pay(2000);
    }

}
```

---

### Output
```
Paid 1000.0 using Credit card: 12345
Paid 2000.0 using PayPal: test@gmail.com
```

This implementation demonstrates how the **Strategy Pattern** allows you to select different algorithms (payment methods) at runtime, promoting flexibility and maintainability.
```