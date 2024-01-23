package protect2;

public class CatChild extends Cat{
    public CatChild(String name, int age, String mauLong) {
        super(name, age, mauLong);
    }

    public void go2() {
        System.out.println(super.name);
        System.out.println(super.mauLong);
    }
}
