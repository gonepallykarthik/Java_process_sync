package Practice_Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Car c1 = new Car(67, 73);
        Car c2 = new Car(32, 45);
        Car c3 = new Car(89, 92);
        Car c4 = new Car(15, 38);
        Car c5 = new Car(51, 87);
        cars.add(c1);
        cars.add(c2);
        cars.add(c3);
        cars.add(c4);
        cars.add(c5);

//        Collections.sort(cars);// comparable

//        compare or sort based on speed
        Collections.sort(cars, (a,b)->{
            return b.speed - a.speed;
        });

        System.out.println(cars);
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().threadId());
        for(int i=1; i<=4; i++) {
            Multithreading mt = new Multithreading(i);
            mt.start();
        }

        Multithreading mt = new Multithreading(10);
        mt.start();
        Multithreading mt2 = new Multithreading(20);
        mt2.start();

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        for(int i=1;i<=10; i++){
            TableCreator t1 = new TableCreator(i, num1);
            Thread t = new Thread(t1);
            t.start();
        }
    }
}
