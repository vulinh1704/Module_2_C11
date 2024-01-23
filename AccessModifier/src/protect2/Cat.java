package protect2;

import protect.Animal;

public class Cat extends Animal {
    protected String mauLong;
    public Cat(String name, int age, String mauLong) {
        super(name, age);
        this.mauLong = mauLong;
    }

    public void go() {
        System.out.println(super.name);
    }

    public static void main(String[] args) {

    }
}
