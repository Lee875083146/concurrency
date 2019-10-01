package com.nopainanymore.concurrency.exceptionhandler;


import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

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

        ThreadFactory gsonThreadFactory = new ThreadFactoryBuilder()
                .setNameFormat("gson-build-thread-%d")
                .setThreadFactory(new CustomThreadFactory())
                .build();
        ExecutorService gsonExecutorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors(), gsonThreadFactory);
        gsonExecutorService.submit(new ExceptionRunnable());
        gsonExecutorService.shutdown();

    }

}
