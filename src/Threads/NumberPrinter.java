package Threads;

public class NumberPrinter implements Runnable{
    int num1;

    public NumberPrinter(int n) {
        this.num1 = n;
    }

    @Override
    public void run() {
        System.out.println("running on thread " + num1 + " " + Thread.currentThread().getName());
    }
}
