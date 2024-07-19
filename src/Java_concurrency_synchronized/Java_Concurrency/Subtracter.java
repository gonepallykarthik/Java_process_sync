package Java_concurrency_synchronized.Java_Concurrency;

import java.util.concurrent.locks.Lock;

public class Subtracter implements Runnable{
    Counter counter;

    public Subtracter(Counter c){
        this.counter = c;

    }
    @Override
    public void run() {
        for(int i=0;i<1000; i++){
            counter.decrement();
        }
    }
}
