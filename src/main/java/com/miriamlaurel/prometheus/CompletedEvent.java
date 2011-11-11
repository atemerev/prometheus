package com.miriamlaurel.prometheus;

import com.miriamlaurel.pms.Message;

/**
 * @author Alexander Temerev, Alexander Kuklev
 * @version $Id$
 */
public class CompletedEvent implements Message {

    private Promise promise;

    public CompletedEvent(Promise promise) {
        this.promise = promise;
    }

    public Promise getPromise() {
        return promise;
    }
}
