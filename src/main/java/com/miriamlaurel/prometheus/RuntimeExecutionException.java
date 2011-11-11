package com.miriamlaurel.prometheus;

/**
 * @author Alexander Temerev, Alexander Kuklev
 * @version $Id$
 */
public class RuntimeExecutionException extends RuntimeException {
    public RuntimeExecutionException() {
    }

    public RuntimeExecutionException(String message) {
        super(message);
    }

    public RuntimeExecutionException(String message, Throwable cause) {
        super(message, cause);
    }

    public RuntimeExecutionException(Throwable cause) {
        super(cause);
    }
}
