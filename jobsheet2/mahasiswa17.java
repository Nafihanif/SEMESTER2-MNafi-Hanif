package jobsheet2;

public class mahasiswa17 {
    String nim;
    String name;
    String Class;
    double GPA;

    public mahasiswa17() {
        // This is a constructor without parameters, it will be called when an object is created without passing any arguments
    }

    public mahasiswa17(String nm, String nim, double GPA, String Cls) {
        name = nm;
        this.nim = nim;
        this.GPA = GPA;
        Class = Cls;
        // If the parameter name is the same as the attribute name, then to refer to the attribute
        // variable the syntax of this is added in front of the attribute name
    }

    void displayInformation() {
        System.out.println("NIM: " + nim);
        System.out.println("Name: " + name);
        System.out.println("Class: " + Class);
        System.out.println("GPA: " + GPA);
    }

    void changeClaas(String newClass) {
        Class = newClass;
    }
    
    void updateGPA(Double newGPA) {
        if (newGPA < 0.0 || newGPA > 4.0) {
            System.out.println("Invalid GPA value. GPA must be between 0.0 and 4.0.");
            return;
        }
        GPA = newGPA;
    }

    String perfomeValue () {
        if (GPA >= 3.5) {
            return "very good performance";
        } else if (GPA >= 3.0) {
            return "good performance";
        } else if (GPA >= 2.0) {
            return "performance is sufficient";
        } else {
            return "less performance";
        }
    }
}