package Threads;

public class AdderThread implements Runnable{
    Counter counter;

    public AdderThread(Counter c) {
        this.counter = c;
    }

    @Override
    public void run() {
        for(int i=0; i<100; i++){
            this.counter.increment();
        }
    }
}
