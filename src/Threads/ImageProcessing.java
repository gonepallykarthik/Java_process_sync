package Threads;

public class ImageProcessing implements Runnable{

    @Override
    public void run() {
        System.out.println("running on thread " + Thread.currentThread().getName());
        System.out.println("processing image!");
    }
}
