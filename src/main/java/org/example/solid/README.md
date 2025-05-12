## Overview
This is a simple Java-based bank application that demonstrates the implementation of the **SOLID principles**. The application includes functionality for creating accounts, parties, and associating them with wealth products. It is designed to showcase clean, modular, and maintainable code adhering to the SOLID design principles.

---

## SOLID Principles in the Project

### 1. **Single Responsibility Principle (SRP)**
Each class in the project has a single responsibility:
- **`Account`**: Represents account-related data.
- **`Party`**: Represents party-related data.
- **`WealthProduct`**: Represents wealth product-related data.

### 2. **Open/Closed Principle (OCP)**
The system is open for extension but closed for modification:
- New account types (e.g., `SavingsAccount`, `CurrentAccount`) can be added by extending the `Account` class without modifying it.
- Similarly, new repository implementations can be added without altering existing code.

### 3. **Liskov Substitution Principle (LSP)**
Subtypes can replace their base types without altering the correctness of the program:
- `SavingsAccount` and `CurrentAccount` can replace the base `Account` class wherever it is used.

### 4. **Interface Segregation Principle (ISP)**
Interfaces are designed to be specific to the needs of the clients:
- Separate interfaces for `AccountRepository` and `PartyRepository` ensure that each repository handles only its specific responsibilities.

### 5. **Dependency Inversion Principle (DIP)**
High-level modules depend on abstractions rather than concrete implementations:
- The `BankService` class depends on the `AccountRepository` and `PartyRepository` interfaces, not their concrete implementations.

---

## Project Structure

```
src/main/java
└── org
    └── example
        └── solid
            └── bank
                ├── models
                │   ├── Account.java
                │   ├── SavingsAccount.java
                │   ├── CurrentAccount.java
                │   ├── Party.java
                │   └── WealthProduct.java
                ├── repository
                │   ├── AccountRepository.java
                │   ├── PartyRepository.java
                │   ├── InMemoryAccountRepository.java
                │   └── InMemoryPartyRepository.java
                ├── services
                │   └── BankService.java
                └── app
                    └── BankApp.java
```

---

## How to Run the Application

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/prasaddharani/design_patterns.git
   cd design_patterns
   ```

2. **Build the Project**:
   Ensure you have Maven installed. Run:
   ```bash
   mvn clean install
   ```

3. **Run the Application**:
   Execute the `BankApp` class:
   ```bash
   mvn exec:java -Dexec.mainClass="org.example.solid.bank.app.BankApp"
   ```

---

## Key Classes and Their Responsibilities

### Models (`models`)
- **`Account`**: Base class for accounts.
- **`SavingsAccount`** and **`CurrentAccount`**: Specific account types.
- **`Party`**: Represents a party (e.g., customer).
- **`WealthProduct`**: Represents a wealth product.

### Repositories (`repository`)
- **`AccountRepository`** and **`PartyRepository`**: Interfaces for data storage and retrieval.
- **`InMemoryAccountRepository`** and **`InMemoryPartyRepository`**: In-memory implementations of the repositories.

### Services (`services`)
- **`BankService`**: Contains business logic for creating accounts and parties.

### Application (`app`)
- **`BankApp`**: Entry point of the application.

---

## Example Output
When you run the application, it will:
1. Create accounts (`SavingsAccount` and `CurrentAccount`).
2. Create parties (`John Doe` and `Jane Smith`).
3. Print a success message:
   ```
   Bank application executed successfully.
   ```

---

## Conclusion
This project demonstrates how to design a clean and maintainable application using the SOLID principles. It ensures that the code is modular, extensible, and easy to understand, making it a great example for learning and applying these principles in real-world projects.