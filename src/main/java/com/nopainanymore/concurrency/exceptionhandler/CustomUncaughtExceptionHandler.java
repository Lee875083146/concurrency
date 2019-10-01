package com.nopainanymore.concurrency.exceptionhandler;

import lombok.extern.slf4j.Slf4j;

/**
 * concurrency: CustomUncaughtExceptionHandler
 *
 * @author nopainanymore
 * @version 2019-09-26 22:06
 */
@Slf4j
public class CustomUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        log.info("CustomUncaughtExceptionHandler- uncaughtException- Thread:{}-{} , Throwable:{}", t.getName(), t.getId(), e.getMessage());
        if (log.isDebugEnabled()) {
            log.debug("CustomUncaughtExceptionHandler- uncaughtException Thread:{}-{}", t.getName(), t.getId(), e);
        }
    }
}
