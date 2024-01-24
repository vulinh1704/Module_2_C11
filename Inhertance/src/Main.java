public class Main {
    public static void main(String[] args) {
        Person person = new Student(1, "Linh", 5.0);
        //Kiểu khai báo      kiểu thực tế
        System.out.println(person.play());
        Person person1 = new StudentChild();
        person1.eat();



        Person p = new Employee();
        p = new Student();

    }
}
