The **Observer Design Pattern** is a behavioral pattern where an object, called the **subject**, maintains a list of dependents, called **observers**. When the subject's state changes, it automatically notifies all its observers. This pattern is useful for implementing distributed event handling systems, where multiple parts of a program need to react to changes in another part.

**Key Points:**
- The subject does not need to know details about its observers.
- Observers can be added or removed at runtime.
- It promotes loose coupling between the subject and observers.

---

### Demo Explanation: Banking App Example

In the demo, we modeled a simple banking notification system:

- **Subject:** `BankAccount`
    - Maintains a list of observers.
    - When a deposit is made, it updates the balance and notifies all observers.

- **Observers:** `EmailNotifier`, `FraudDetector`
    - `EmailNotifier` simulates sending an email to the user about the new balance.
    - `FraudDetector` simulates monitoring the account for suspicious activity.

- **How it works:**
    1. Observers are registered to the `BankAccount`.
    2. When `deposit()` is called, the balance changes.
    3. `BankAccount` calls `update()` on each observer, passing the new balance.
    4. Each observer reacts in its own way (prints a message).

This setup allows you to add more observers (like SMS notifications, logging, etc.) without changing the `BankAccount` logic, demonstrating the flexibility and decoupling provided by the Observer pattern.