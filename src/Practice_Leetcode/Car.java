package Practice_Leetcode;

public class Car implements Comparable<Car> {
    int price;
    int speed;

    public Car(int price, int speed) {
        this.price = price;
        this.speed = speed;
    }

    @Override
    public int compareTo(Car o) {
        return this.price - o.price;
    }


    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", speed=" + speed +
                '}';
    }
}
