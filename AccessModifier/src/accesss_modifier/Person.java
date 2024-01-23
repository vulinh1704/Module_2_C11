package accesss_modifier;

public class Person {
    private int cccd;
    private String name;
    private int weight;

    public Person(int cccd, String name, int weight) {
        this.cccd = cccd;
        this.name = name;
        this.weight = weight;
    }

    public Person() {

    }

    public void eat() {
        System.out.println(name + " Đang ăn");
    }


    public void setName(String nameInput) {
        this.name = nameInput;
    }

    public String getName() {
        return this.name;
    }


    public int getCccd() { //getter
        return cccd;
    }

    public static void main(String[] args) {
        Person p = new Person(2, "Linh2", 61);
        System.out.println(p.name);
    }
}
