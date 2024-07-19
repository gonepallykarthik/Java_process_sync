package Threads;

public class DenoiseImage implements Runnable{
    @Override
    public void run() {
        System.out.println("running on thread " + Thread.currentThread().getName());
        System.out.println("Denoise Image...");
    }
}
