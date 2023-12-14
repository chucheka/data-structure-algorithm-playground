package com.concurrency;

import java.util.concurrent.*;

public class CustomExecutorService {
    public static void main(String[] args) {

        // CREATE AN EXECUTOR SERVICE WITH SPECIFIC NUMBER OF THREAD POOL
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // SUBMIT TASKS TO THE SERVICE

        executorService.submit(new RandomRunnable());

        executorService.submit(()-> System.out.println("SECOND RUNNABLE IMP ON EXECUTOR SERVICE"));

        executorService.submit(()-> System.out.println("THIRD RUNNABLE IMP ON EXECUTOR SERVICE"));

        Future<String> future = executorService.submit(new RandomCallable1());
        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
