package org.vspaz.structural;

public class Proxy extends Worker {
    static Worker worker;
    @Override
    public String doSomeWork() {
        if (worker == null) {
            worker = new TaskWorker();
        }
        return worker.doSomeWork();
    }
}
