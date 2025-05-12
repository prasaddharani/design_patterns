package org.example.patterns.singleton.lazy;

public class SingletonSync {
    // Instance variable that holds the singleton instance.
    // Initially set to null, as the instance will be created on demand.
    private static SingletonSync instance = null;

    // Private constructor to prevent instantiation of the class from outside.
    private SingletonSync() {
    }

    // It is synchronized to ensure thread safety in a multi-threaded environment.
    // Only one thread will be able to access this method at a time.
    public static synchronized SingletonSync getInstance() {
        // Check if the instance is null. If it is, create the Singleton instance.
        // The synchronized keyword ensures that only one thread can create the instance.
        if (instance == null) {
            instance = new SingletonSync();
        }
        return instance;
    }
}
