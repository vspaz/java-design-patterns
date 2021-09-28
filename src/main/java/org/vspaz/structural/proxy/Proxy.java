package org.vspaz.structural.proxy;

import org.vspaz.structural.proxy.Worker;

public class Proxy extends Worker {
    static Worker worker;
    @Override
    public String doWork() {
        if (worker == null) {
            worker = new TaskWorker();
        }
        return worker.doWork();
    }
}
