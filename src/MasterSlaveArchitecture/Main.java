package MasterSlaveArchitecture;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Master slave architecture");
        Master master = new Master();
        Slave slave = new Slave(master);

        Thread t1 = new Thread(()->{
            for(int i=0; i<10; i++){
                master.add(String.valueOf(i));
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t2 = new Thread(()->{
            slave.startSync();
        });

        t1.start(); // starting master thread
        t2.start(); // starting slave thread

        t1.join();
        t2.join();

        System.out.println("done! ");
        slave.showData();

    }
}
