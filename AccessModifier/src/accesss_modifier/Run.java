package accesss_modifier;

public class Run {
    public static void main(String[] args) {
        Animal animal = new Animal("Mèo", 3);
        System.out.println(animal.age);
        System.out.println(animal.name);
        animal.go();
    }
}
