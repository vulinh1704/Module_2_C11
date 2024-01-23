package accesss_modifier;

public class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void go() {
        System.out.println(this.name + " Đang đi");
    }
}
