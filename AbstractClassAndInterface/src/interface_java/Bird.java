package interface_java;
class A {

}
public class Bird extends A implements Flyable, Animal{
    @Override
    public void bay() {

    }


    @Override
    public void haCanh() {

    }

    @Override
    public void makeSound() {

    }
}


class Main {
    public static void main(String[] args) {
        System.out.println(Flyable.SO_CANH);
        Flyable flyable = new Bird();
        flyable.bay();
        Animal animal = new Bird();
        animal.bay();
    }
}