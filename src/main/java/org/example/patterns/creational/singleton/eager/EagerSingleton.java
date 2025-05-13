package org.example.patterns.creational.singleton.eager; // Package declaration

/**
 * EagerSingleton demonstrates eager initialization of a singleton instance.
 * The instance is created at class loading time.
 */
public class EagerSingleton {

    // Static final instance created eagerly when the class is loaded
    public static final EagerSingleton instance = new EagerSingleton();

    // Private constructor prevents instantiation from other classes
    private EagerSingleton() {
        // Initialization logic, if any, goes here
    }

    // Optional: A public static method to return the singleton instance
    public static EagerSingleton getInstance() {
        return instance;
    }
}
