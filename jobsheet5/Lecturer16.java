package jobsheet5;

public class Lecturer16 {
    String id;
    String name;
    boolean gender; // true = Male, false = Female
    int age;

    // Parameterized Constructor 
    public Lecturer16(String id, String name, boolean gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    // Method to display lecturer info 
    public void print() {
        String genderStr = gender ? "Male" : "Female";
        System.out.println("ID: " + id + " | Name: " + name + " | Gender: " + genderStr + " | Age: " + age);
    }
}
