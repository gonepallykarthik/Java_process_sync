package Java_concurrency_synchronized.Java_Concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private int count;
    private AtomicInteger a;

    public Counter(){
        this.count = 0;
        this.a = new AtomicInteger(0);
    }

    public void increment(){
        synchronized (this){
            count++;
        }
        this.a.addAndGet(1);
    }

    public synchronized void decrement(){
        synchronized (this) {
            this.count--;
        }
    }

    public int getCount(){
        return this.count;
    }
}
