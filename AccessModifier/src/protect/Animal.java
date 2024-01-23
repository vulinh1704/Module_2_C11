package protect;

public class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Protected là access modifier cho phép truy cập
// ở cùng package hoặc khác package nhưng phải nằm trong mối quan hệ kế thùa
