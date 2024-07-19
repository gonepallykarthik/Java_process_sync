package Threads;

import java.util.concurrent.Callable;

public class AddTwoNumsCallable implements Callable<Integer> {
    int num1;
    int num2;

    public AddTwoNumsCallable(int n1, int n2) {
        this.num1 = n1;
        this.num2 = n2;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("from thread " + Thread.currentThread().getName());
        return this.num1 + this.num2;
    }
}
