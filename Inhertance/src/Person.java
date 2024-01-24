public class Person {
    private int id; // = 0
    private String name; // = nulls


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

    public String play() {
        return "Person is playing";
    }

    public void eat() {
        System.out.println("Person is eating");
    }

}

/*
 Ghi đè phương thức các phương thức cùng tên cùng kiểu trả về,
 cùng tham số truyền vào, khác nhau về triển khai.
 Bắt buộc chỉ có thể triển khai trong mỗi quan hệ kế thừa.
 */