package model;

import java.util.Locale;

public class Student {
    private int id; // 0
    private String name; // null
    private String gender;
    private double score; // 0.0

    public Student(int id, String name, String gender, double score) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.score = score;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        int a;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student have id: " + id + " - name: " + name + " - score: " + score;
    }

}
