package Java_Concurrency;

public class FetchData implements Runnable{

    public FetchData(){ }
    @Override
    public void run() {
        System.out.println("Fetching.....");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Fetching the data finished");
    }
}
