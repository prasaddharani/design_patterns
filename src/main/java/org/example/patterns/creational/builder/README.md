---

### Key Characteristics
1. **Encapsulation of Construction Logic**: The builder encapsulates the logic for constructing the object.
2. **Step-by-Step Construction**: The object is built step by step, allowing for more control over the construction process.
3. **Immutability**: The final object is often immutable once built.

---

### Steps to Implement the Builder Pattern
1. **Create a Product Class**:
    - Define the class for the object to be built.

2. **Create a Builder Class**:
    - Define a builder class with methods to set each property of the product.
    - Include a `build()` method to return the final product.

3. **Use the Builder in Client Code**:
    - Use the builder to construct the object step by step.

---

### Example: Building a Bank Account

#### Step 1: Product Class

```java
package org.example.patterns.creational.builder;

public class BankAccount {
   private String accountId;
   private String accountType;
   private String ownerName;
   private double balance;

   private BankAccount(Builder builder) {
      this.accountId = builder.accountId;
      this.accountType = builder.accountType;
      this.ownerName = builder.ownerName;
      this.balance = builder.balance;
   }

   public static class Builder {
      private String accountId;
      private String accountType;
      private String ownerName;
      private double balance;

      public Builder setAccountId(String accountId) {
         this.accountId = accountId;
         return this;
      }

      public Builder setAccountType(String accountType) {
         this.accountType = accountType;
         return this;
      }

      public Builder setOwnerName(String ownerName) {
         this.ownerName = ownerName;
         return this;
      }

      public Builder setBalance(double balance) {
         this.balance = balance;
         return this;
      }

      public BankAccount build() {
         return new BankAccount(this);
      }
   }

   @Override
   public String toString() {
      return "BankAccount{" +
              "accountId='" + accountId + '\'' +
              ", accountType='" + accountType + '\'' +
              ", ownerName='" + ownerName + '\'' +
              ", balance=" + balance +
              '}';
   }
}
```

---

#### Step 2: Client Code

```java
package org.example.patterns.creational.builder;

public class BankApp {
   public static void main(String[] args) {
      BankAccount account = new BankAccount.Builder()
              .setAccountId("A001")
              .setAccountType("Savings")
              .setOwnerName("John Doe")
              .setBalance(1000.0)
              .build();

      System.out.println(account);
   }
}
```

---

### Output
```
BankAccount{accountId='A001', accountType='Savings', ownerName='John Doe', balance=1000.0}
```

This implementation demonstrates how the **Builder Pattern** simplifies the creation of complex objects while maintaining readability and flexibility.