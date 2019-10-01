package com.nopainanymore.concurrency.exceptionhandler;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * concurrency: Client
 *
 * @author nopainanymore
 * @version 2019-09-26 22:10
 */
public class Client {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors(), new CustomThreadFactory());
        executorService.submit(new ExceptionRunnable());
        executorService.shutdown();
    }

}
