package Threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class ArrayCreator implements Callable<List<Integer>> {
    int size;
    List<Integer> nums;
    public ArrayCreator(int n) {
        this.size = n;
        this.nums = new ArrayList<Integer>();

    }

    @Override
    public List<Integer> call() throws Exception {
        for(int i=1; i<=this.size; i++){
            this.nums.add(i);
        }
        return this.nums;
    }
}
