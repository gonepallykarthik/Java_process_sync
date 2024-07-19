package Practice_Leetcode;

public class TableCreator implements Runnable {
    int n;
    int i;

    public TableCreator(int i,int n){
        this.i = i;
        this.n = n;
    }

    @Override
    public void run(){
        System.out.println(this.n + " times " + this.i + " is " + this.i*this.n);
    }

}
