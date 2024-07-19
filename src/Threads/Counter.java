package Threads;

public class Counter {
    private int count;

    public Counter(){
        count = 0;
    }

    public void increment(){
        this.count += 1;
    }

    public void decrement(){
        this.count -=1;
    }

    public int getCount(){
        return this.count;
    }
}
