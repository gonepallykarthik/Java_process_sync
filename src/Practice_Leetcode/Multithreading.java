package Practice_Leetcode;

public class Multithreading extends Thread{
    int data;

    public Multithreading(int data) {
        this.data = data;
    }
    @Override
    public void run(){
        for(int i=1; i<5; i++){
            System.out.println(i + " from thread " + this.data);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
