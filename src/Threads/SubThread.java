package Threads;

public class SubThread implements Runnable{
    Counter counter;

    public SubThread(Counter c) {
        this.counter = c;
    }

    @Override
    public void run() {
        for(int i=0; i<100; i++){
            this.counter.decrement();
        }
    }
}
