package jobsheet5;

public class Student16 {
    String nim;
    String name;
    String studentClass;
    double gpa;

    // Default Constructor
    public Student16() {
    }

    // Parameterized Constructor
    public Student16(String nim, String name, String studentClass, double gpa) {
        this.nim = nim;
        this.name = name;
        this.studentClass = studentClass;
        this.gpa = gpa;
    }

    // Method to display student info
    public void print() {
        System.out.println("NIM: " + nim + ", Name: " + name + ", Class: " + studentClass + ", GPA: " + gpa);
    }
}
