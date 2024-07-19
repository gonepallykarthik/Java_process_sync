package Practice_Leetcode;

public class DemoMain {
    public static void main(String[] args) {
        System.out.println("welcome to this application");
//        InnerClass c1 = new InnerClass(10, 20);
//        InnerClass.Demo d1 = new InnerClass.Demo(100, 202);
//        d1.InnerMethod();

        Animal c1 = new Cat("bruce", "some");
        Dog c2 = new Dog("bruce", "some");
        c1.eat();
        System.out.println(c1);

    }
}
