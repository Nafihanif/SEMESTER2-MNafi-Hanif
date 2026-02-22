package jobsheet2;

public class mahasiswa {
    String nim;
    String name;
    String Class;
    Double GPA;

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
            return "Excellent";
        } else if (GPA >= 3.0) {
            return "Good";
        } else if (GPA >= 2.0) {
            return "Average";
        } else {
            return "Poor";
        }
    }
}
