package gb5;

import java.io.Serializable;

public class Student implements Serializable {
    private int student;
    private String name;
    private String email;


    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student=" + student +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }



    public Student(int student, String name, String email) {
        this.student = student;
        this.name = name;
        this.email = email;
    }
}
