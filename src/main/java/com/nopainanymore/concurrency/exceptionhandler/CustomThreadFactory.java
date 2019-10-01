package com.nopainanymore.concurrency.exceptionhandler;

import java.util.concurrent.ThreadFactory;

/**
 * concurrency: CustomThreadFactory
 *
 * @author nopainanymore
 * @version 2019-09-26 22:11
 */
public class CustomThreadFactory implements ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        thread.setUncaughtExceptionHandler(new CustomUncaughtExceptionHandler());
        return thread;
    }
}
