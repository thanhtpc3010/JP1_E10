package Entity;
import java.util.Scanner;

public class Student {
    // Properties
    private int id;
    private String fullname;
    private String email;
    private float mark;

    // No-argument constructor
    public Student() {
    }

    // Full-argument constructor
    public Student(int id, String fullname, String email, float mark) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.mark = mark;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }
}
