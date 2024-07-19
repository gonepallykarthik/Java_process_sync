package Practice_Leetcode;

public class Dog implements Animal{
    String name;
    String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    @Override
    public void eat() {
        System.out.println("dog is eating!");
    }

    @Override
    public void sleep() {
        System.out.println("dog is sleeping!");
    }

    @Override
    public void makeSound() {
        System.out.println("barks barks");
    }
}
