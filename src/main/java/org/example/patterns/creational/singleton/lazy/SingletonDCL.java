package org.example.patterns.creational.singleton.lazy;

/**
 * This class demonstrates the Double-Checked Locking (DCL) pattern for Singleton implementation.
 * It provides a thread-safe mechanism for instantiating the Singleton object.
 * This implementation ensures that the instance is created only when it's needed (lazy initialization)
 * and improves performance by reducing the overhead of synchronization after the instance is created.
 */
public class SingletonDCL {

    // The Singleton instance, marked as volatile to ensure visibility across threads.
    // This prevents caching of the instance by threads, ensuring that all threads see the most up-to-date value.
    private static volatile SingletonDCL instance = null;

    // Private constructor to prevent instantiation from other classes.
    private SingletonDCL() {
    }

    /**
     * Retrieves the Singleton instance.
     * The method checks if the instance is null twice, using double-checked locking.
     * This ensures that synchronization is only performed when the instance is being created for the first time.
     *
     * @return The single instance of the SingletonDCL class.
     */
    public static SingletonDCL getInstance() {
        if (instance == null) {
            // Enter synchronized block only if the instance is null to ensure thread safety.
            synchronized (SingletonDCL.class) {
                // Double-check to ensure that another thread hasn't already created the instance.
                if (instance == null) {
                    instance = new SingletonDCL(); // Create the Singleton instance.
                }
            }
        }
        return instance; // Return the Singleton instance.
    }
}
