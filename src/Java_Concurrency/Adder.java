package Java_Concurrency;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable{
    Counter counter;
    Lock lock;

    public Adder(Counter c, Lock lock){
        this.counter = c;
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            lock.lock();
            counter.increment();
            lock.unlock();
        }
    }
}
