package com.concurrency;

import java.util.concurrent.Callable;

public class RandomCallable1 implements Callable {
    @Override
    public String call() throws Exception {
        Thread.sleep(2000);
        return "THE CALLABLE RESULT";
    }
}
