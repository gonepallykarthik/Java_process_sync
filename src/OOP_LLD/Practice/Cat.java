package OOP_LLD.Practice;

public class Cat extends Animal {

    public Cat(String name, String type){
        super(name, type);
    }

    @Override
    public void play() {
        System.out.println("cat is playing!!");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating meow meow");
    }
}
