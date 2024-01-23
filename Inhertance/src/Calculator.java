public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, double b) {
        return (int) (a + b);
    }
}

// calculator.add(1,2.0d)
