package OOP_LLD.Practice;

public class Dog extends Animal {

    public  Dog(String name, String type){
        super(name, type);
    }
    @Override
    public void play() {
        System.out.println("Dog is playing!!");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating bowww...");
    }
}
