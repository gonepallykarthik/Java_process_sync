package Threads;

import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ImageProcessing img = new ImageProcessing();
//        Thread t1 = new Thread(img);
//        t1.start();
//
//        DenoiseImage img2 = new DenoiseImage();
//        Thread t2 = new Thread(img2);
//        t2.start();
//
//        SyncPhotosToCloud photos = new SyncPhotosToCloud();
//        Thread t3 = new Thread(photos);
//        t3.start();

//        ExecutorService executor = Executors.newCachedThreadPool();
//        for(int i=1; i<=20; i++){
//           Future<Integer> res =  executor.submit(new AddTwoNumsCallable(i, 10));
//            System.out.println(res.get());
//        }
//
//        executor.shutdown();


//        Write code to achieve the following
//        A class Client with a main method.
//        Create a class ArrayCreator which takes as input a number (n)
//        ArrayCreator should create an ArrayList which should contain numbers from 1 to n
//        ArrayCreator should implement appropriate Callable interface and return the arraylist discussed above to calling thread
//        Client class should invoke ArrayCreator over a new thread and get the arraylist from ArrayCreator class and print it.

//        ExecutorService executor = Executors.newCachedThreadPool();
//        Future<List<Integer>> nums = executor.submit(new ArrayCreator(10));
//        List<Integer> res = nums.get();
//        System.out.println(res);
//        executor.shutdown();
//
//        TreeNode root = new TreeNode(10);
//        TreeNode leftNode = new TreeNode(20);
//        TreeNode rightNode = new TreeNode(30);
//
//        root.left = leftNode;
//        root.right = rightNode;
//
//        ExecutorService exe = Executors.newCachedThreadPool();
//        TreeSizeCalculator ts = new TreeSizeCalculator(root, exe);
//        Future<Integer> size_of_tree =  exe.submit(ts);
//        System.out.println(size_of_tree.get());
//        exe.shutdown();

    }
}
