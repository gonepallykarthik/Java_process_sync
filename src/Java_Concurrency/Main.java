package Java_Concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("NonCurrency in java");
        Counter c = new Counter();
        Lock lock = new ReentrantLock();

        Thread adderThread = new Thread(new Adder(c, lock));
        Thread subtracterThread = new Thread(new Subtracter(c, lock));
        adderThread.start();
        subtracterThread.start();

        adderThread.join();
        subtracterThread.join();

        System.out.println(c.getCount());


//        Thread t1 = new Thread(new FetchData());
//        t1.start();
//        System.out.println("perform some other taks while fetching data from database");
//        System.out.println("do something ");
    }
}
