package abstract_class;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * 2 * Math.PI;
    }

    @Override
    public double getP() {
        return 0;
    }
}
