The **Factory Design Pattern** is a **creational design pattern** that provides an interface or method to create objects without specifying their exact class. It encapsulates the object creation logic, making the code more modular, reusable, and easier to maintain.

---

### Key Characteristics
1. **Encapsulation of Object Creation**: The factory handles the instantiation logic, so the client code does not need to know the exact class being instantiated.
2. **Abstraction**: The client interacts with an interface or abstract class, not the concrete implementation.
3. **Flexibility**: Adding new types of objects requires minimal changes to the factory.

---

### Steps to Remember the Factory Pattern
1. **Define a Common Interface or Abstract Class**:
    - Create a base type (interface or abstract class) that all concrete classes will implement or extend.

2. **Create Concrete Implementations**:
    - Implement the base type in concrete classes that represent the specific objects to be created.

3. **Create the Factory Class**:
    - Encapsulate the object creation logic in a factory class.
    - Use a method (e.g., `createObject`) to return instances of the base type.

4. **Use the Factory in Client Code**:
    - Call the factory method to create objects instead of directly instantiating them.

5. **(Optional) Use Polymorphism or Registry for OCP**:
    - Use a registry-based or polymorphic factory to adhere to the **Open/Closed Principle**.

---

### Example Workflow
1. **Base Class**: Define an abstract class or interface (e.g., `Account`).
2. **Concrete Classes**: Create specific implementations (e.g., `SavingsAccount`, `CurrentAccount`).
3. **Factory Class**: Implement a factory (e.g., `AccountFactory`) to create objects based on input.
4. **Client Code**: Use the factory to create objects and interact with them via the base class.