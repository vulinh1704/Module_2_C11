package protect;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Mèo", 1);
        System.out.println(animal.name);
    }
}
