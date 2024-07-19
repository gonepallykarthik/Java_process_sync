package Java_Concurrency;

import java.util.concurrent.locks.Lock;

public class Subtracter implements Runnable{
    Counter counter;
    Lock lock;

    public Subtracter(Counter c, Lock lock){
        this.counter = c;
        this.lock = lock;
    }
    @Override
    public void run() {
        for(int i=0;i<1000; i++){
            lock.lock();
            counter.decrement();
            lock.unlock();
        }
    }
}
