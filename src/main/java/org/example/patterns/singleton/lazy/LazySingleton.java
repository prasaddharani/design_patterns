package org.example.patterns.singleton.lazy; // Package declaration

/**
 * LazySingleton demonstrates lazy initialization of a singleton instance.
 * Instance is created only when it is needed (on first call to getInstance()).
 */
public class LazySingleton {

    // Initially, the instance is null and will be created on first request
    private static LazySingleton instance = null;

    // Private constructor prevents instantiation from other classes
    private LazySingleton() {
        // Initialization logic if needed
    }

    /**
     * Returns the singleton instance. Not thread-safe.
     */
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton(); // Create instance if it doesn't exist
        }
        return instance;
    }
}
