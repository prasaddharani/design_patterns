The **Decorator Pattern** is a structural design pattern that allows you to add new functionality to objects dynamically by wrapping them with decorator classes. It promotes code flexibility and adheres to the Open/Closed Principle.

---

### Example: Coffee Shop

Suppose you have a `Coffee` interface, and you want to add features like milk or sugar without modifying the original coffee classes.

---

**1. Component Interface (`Coffee`)**
```java
package org.example.patterns.structural.decorator;

public interface Coffee {
    String getDescription();
    double getCost();
}
```

**2. Concrete Component (`SimpleCoffee`)**
```java
package org.example.patterns.structural.decorator;

public class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}
```

**3. Decorator Base Class**
```java
package org.example.patterns.structural.decorator;

public abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    public double getCost() {
        return decoratedCoffee.getCost();
    }
}
```

**4. Concrete Decorators**
```java
package org.example.patterns.structural.decorator;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return super.getDescription() + ", Milk";
    }

    public double getCost() {
        return super.getCost() + 1.5;
    }
}
```

```java
package org.example.patterns.structural.decorator;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }

    public double getCost() {
        return super.getCost() + 0.5;
    }
}
```

**5. Client Usage**
```java
package org.example.patterns.structural.decorator;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());

        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " $" + coffee.getCost());
    }
}
```

**Output:**
```
Simple Coffee $5.0
Simple Coffee, Milk $6.5
Simple Coffee, Milk, Sugar $7.0
```

This demonstrates how you can add features to objects at runtime using the Decorator Pattern.