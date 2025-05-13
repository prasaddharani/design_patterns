The **Command Design Pattern** is a behavioral design pattern that encapsulates a request as an object, thereby allowing you to parameterize clients with different requests, queue or log requests, and support undoable operations.

---

### Key Components
1. **Command Interface**: Declares a method for executing a command.
2. **Concrete Command**: Implements the command interface and defines the binding between a receiver and an action.
3. **Receiver**: The object that performs the actual work when the command is executed.
4. **Invoker**: Stores and executes commands.
5. **Client**: Creates and configures commands.

---

### Example: Remote Control System

#### Step 1: Define the Command Interface
```java
package org.example.patterns.behavioral.command;

public interface Command {
    void execute();
}
```

#### Step 2: Create the Receiver
```java
package org.example.patterns.behavioral.command;

public class Light {
    public void turnOn() {
        System.out.println("Light is ON");
    }

    public void turnOff() {
        System.out.println("Light is OFF");
    }
}
```

#### Step 3: Implement Concrete Commands
```java
package org.example.patterns.behavioral.command;

public class TurnOnLightCommand implements Command {
    private Light light;

    public TurnOnLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
```

```java
package org.example.patterns.behavioral.command;

public class TurnOffLightCommand implements Command {
    private Light light;

    public TurnOffLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
```

#### Step 4: Create the Invoker
```java
package org.example.patterns.behavioral.command;

public class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        if (command != null) {
            command.execute();
        } else {
            System.out.println("No command set");
        }
    }
}
```

#### Step 5: Client Code
```java
package org.example.patterns.behavioral.command;

public class CommandApp {
    public static void main(String[] args) {
        Light light = new Light();

        Command turnOnCommand = new TurnOnLightCommand(light);
        Command turnOffCommand = new TurnOffLightCommand(light);

        RemoteControl remote = new RemoteControl();

        // Turn the light ON
        remote.setCommand(turnOnCommand);
        remote.pressButton();

        // Turn the light OFF
        remote.setCommand(turnOffCommand);
        remote.pressButton();
    }
}
```

---

### Output
```
Light is ON
Light is OFF
```

This implementation demonstrates how the **Command Pattern** decouples the sender (Invoker) from the receiver, making it easy to add new commands or modify existing ones.