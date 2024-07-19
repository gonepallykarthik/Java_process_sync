package OOP_LLD.Practice;

public abstract class Animal {
    String name;
    String type;

    public Animal(String Animal_name, String t) {
        name = Animal_name;
        type = t;
    }

    public abstract void play();
    public abstract void eat();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
