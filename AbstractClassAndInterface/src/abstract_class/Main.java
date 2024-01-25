package abstract_class;

public class Main {
    public static void main(String[] args) {
//        abstract_class.Shape shape = new abstract_class.Shape();
        Shape shape = new Circle(2);
        System.out.println(shape.getArea());
    }
}
