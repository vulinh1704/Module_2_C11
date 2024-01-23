public class Person {
    private int id; // = 0
    private String name; // = nulls

    public Person(int id) {
        this.id = id;
    }

    public Person() {
        this.name = "Linh";
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
