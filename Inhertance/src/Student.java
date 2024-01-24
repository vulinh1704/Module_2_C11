public class Student extends Person {
    private double score;

    public Student(int id, String name, double score) {
        super(id, name);
        this.score = score;
    }

    public Student() {
        super();
    }

    public double getScore() {
        super.getId();
        return this.score;
    }

    @Override
    public String play() {
        return "Student is playing";
    }
}
