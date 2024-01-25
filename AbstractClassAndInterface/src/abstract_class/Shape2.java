package abstract_class;

public abstract class Shape2 extends Shape {
    public abstract void display();
}

class Rectangle extends Shape2 {

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getP() {
        return 0;
    }

    @Override
    public void display() {

    }
}