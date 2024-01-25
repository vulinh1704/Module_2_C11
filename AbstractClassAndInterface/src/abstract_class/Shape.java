package abstract_class;

public abstract class Shape {

    private String color;

    public Shape() {
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();

    public abstract double getP();

    public void show() {
        System.out.println("Day la hinh");
    }
}



