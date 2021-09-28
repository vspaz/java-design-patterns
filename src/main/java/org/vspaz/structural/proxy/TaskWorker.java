package org.vspaz.structural.proxy;

import org.vspaz.structural.proxy.Worker;

public class TaskWorker extends Worker {
    @Override
    public String doWork() {
        return "this is task worker";
    }
}
