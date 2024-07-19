package Threads;

public class SyncPhotosToCloud implements Runnable{

    @Override
    public void run() {
        System.out.println("running on thread " + Thread.currentThread().getName());
        System.out.println("Sync photos to cloud ...");
    }
}
