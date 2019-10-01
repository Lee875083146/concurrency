package com.nopainanymore.concurrency.exceptionhandler;

import lombok.extern.slf4j.Slf4j;

/**
 * concurrency: ExceptionRunnable
 *
 * @author nopainanymore
 * @version 2019-09-26 22:18
 */
@Slf4j
public class ExceptionRunnable implements Runnable {

    @Override
    public void run() {
        log.info("ExceptionRunnable- run ");
        throw new IllegalArgumentException("exception");
    }
}
