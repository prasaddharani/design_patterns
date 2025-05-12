package org.example.patterns.singleton;

import org.example.patterns.singleton.eager.EagerSingleton;
import org.example.patterns.singleton.lazy.LazySingleton;
import org.example.patterns.singleton.lazy.SingletonDCL;
import org.example.patterns.singleton.lazy.SingletonHolder;
import org.example.patterns.singleton.lazy.SingletonSync;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Singleton {
    public static void main(String[] args) throws InterruptedException {
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        System.out.println("Eager Singleton1: "+ eagerSingleton1.hashCode());
        System.out.println("Eager Singleton2: "+ eagerSingleton2.hashCode());

        SingletonSync singletonSync1 = SingletonSync.getInstance();
        SingletonSync singletonSync2 = SingletonSync.getInstance();
        System.out.println("Lazy singletonSync1: " + singletonSync1.hashCode());
        System.out.println("Lazy singletonSync2: " + singletonSync2.hashCode());

        SingletonDCL singletonDCL1 = SingletonDCL.getInstance();
        SingletonDCL singletonDCL2 = SingletonDCL.getInstance();
        System.out.println("Lazy singletonDCL1: " + singletonDCL1.hashCode());
        System.out.println("Lazy singletonDCL2: " + singletonDCL2.hashCode());

        SingletonHolder singletonHolder1 = SingletonHolder.getInstance();
        SingletonHolder singletonHolder2 = SingletonHolder.getInstance();
        System.out.println("Lazy singletonHolder1: " + singletonHolder1.hashCode());
        System.out.println("Lazy singletonHolder2: " + singletonHolder2.hashCode());


        // Create an executor service with a pool of 100 threads
        ExecutorService executorService = Executors.newFixedThreadPool(100);

        // Runnable task that will be executed by multiple threads
        Runnable task = () -> {
            // Below LazySingleton is not thread safe so we will get different instance (different hashcode)
            LazySingleton instance = LazySingleton.getInstance();
            // Below SingletonHolder is thread safe so we will get same instance (same hashcode)
            //SingletonHolder instance = SingletonHolder.getInstance();
            System.out.println(Thread.currentThread().getName() + " - Instance hashCode: " + instance.hashCode());
        };

        // Submit 50 tasks to the executor to simulate concurrent access
        for (int i = 0; i < 20; i++) {
            executorService.submit(task);
        }

        // Shutdown the executor service
        executorService.shutdown();

        // Wait for all tasks to finish
        while (!executorService.isTerminated()) {
            // Can add logging or other logic here if needed
        }
    }
}
