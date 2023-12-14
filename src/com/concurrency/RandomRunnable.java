package com.concurrency;

public class RandomRunnable implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("THREAD ABRUPTILTY INTERRUPTED");
//            throw new RuntimeException(e);
        }
        System.out.println("THE FIRST THREAD");
    }
}
