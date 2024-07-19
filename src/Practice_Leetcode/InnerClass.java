package Practice_Leetcode;

public class InnerClass {
    int data;
    int age;

    public InnerClass(int data, int age){
        this.data = data;
        this.age = age;
    }

    public static class Demo {
        int num1;
        int num2;

        public Demo(int n1, int n2){
            this.num1 = n1;
            this.num2 = n2;
            System.out.println("from constructor");
        }
        public void InnerMethod(){
            System.out.println("from inner class " + this.num1 + this.num2);
        }
    }

    public void display(){
        System.out.println(this.data + " and " + this.age);
    }
}
