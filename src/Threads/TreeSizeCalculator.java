package Threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer> {
    ExecutorService exe;
    TreeNode root;
    public TreeSizeCalculator(TreeNode root, ExecutorService e){
        this.root = root;
        this.exe = e;
    }

    @Override
    public Integer call() throws Exception {
        if(root == null) {
            return 0;
        }

        Future<Integer> left_future = exe.submit(new TreeSizeCalculator(root.left, exe));
        Future<Integer> right_future = exe.submit(new TreeSizeCalculator(root.right, exe));

        return 1 + left_future.get() + right_future.get();
    }
}
