package com.concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Shopper implements Runnable {
    public static int garlicCount = 0;

    @Override
    public void run() {
        for (int i = 0; i < 10_000_000; i++) {
            synchronized (Shopper.class){
                garlicCount++;
            }
        }
    }
}
//public class Shopper implements Runnable {
//    public static int garlicCount = 0;
//
//    // Method is marked static to add intrinsic lock i.e
//    // each instance of the class Shopper that calls the
//    // method uses the same method
//    private static synchronized void addGarlic() {
//        garlicCount++;
//    }
//
//    @Override
//    public void run() {
//
//        for (int i = 0; i < 10_000_000; i++) {
//            addGarlic();
//        }
//
//    }
//}

//
//public class Shopper implements Runnable {
//    public static AtomicInteger garlicCount = new AtomicInteger(0);
//
//    public static Lock pencil = new ReentrantLock();
//
//    @Override
//    public void run() {
//
//        for (int i = 0; i < 10_000_000; i++) {
//            garlicCount.incrementAndGet();
//        }
//
//    }
//}

/*
public class Shopper implements Runnable {
        public static int garlicCount = 0;

    public static Lock pencil = new ReentrantLock();

    @Override
    public void run() {

        for (int i = 0; i < 10_000_000; i++) {
            pencil.lock();
            garlicCount++;
            pencil.unlock();
        }

    }
}
*/