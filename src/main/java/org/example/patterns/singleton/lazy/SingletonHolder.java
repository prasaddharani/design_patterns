package org.example.patterns.singleton.lazy;

/**
 * This class implements the Singleton design pattern using the **Bill Pugh Singleton Design**.
 * It leverages the static inner class technique to ensure the Singleton instance is created lazily
 * and thread-safely. The instance is only created when the `getInstance()` method is called for the first time.
 * This implementation is thread-safe and avoids the synchronization overhead present in other lazy loading Singleton implementations.
 */
public class SingletonHolder {

    // Private constructor to prevent instantiation from outside the class.
    private SingletonHolder() {
    }

    /**
     * This inner static class holds the Singleton instance.
     * The instance is created only when the class is loaded by the class loader, which happens the first time
     */
    private static class Holder {
        // The Singleton instance is created when this class is loaded.
        private static final SingletonHolder INSTANCE = new SingletonHolder();
    }

    /**
     * This method returns the Singleton instance.
     * It uses the Holder inner class to retrieve the instance, which ensures that the instance is created lazily
     * and is thread-safe without synchronization overhead.
     */
    public static SingletonHolder getInstance() {
        return Holder.INSTANCE;
    }
}
