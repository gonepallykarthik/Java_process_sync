package Practice_Leetcode;

public class Cat implements Animal{
    String name;
    String breed;
    public Cat(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    @Override
    public void eat() {
        System.out.println("cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("cat is sleeping!");
    }

    @Override
    public void makeSound() {
        System.out.println("meow meow");
    }
}
