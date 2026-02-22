package jobsheet2;

public class LecturerMain {
    public static void main(String[] args) {
        
        System.out.println("=== OBJECT 1 (Default Constructor) ===");
        // Instantiating object using the default constructor [cite: 267-268]
        Lecturer17 lec1 = new Lecturer17();
        lec1.idLecturer = "L001";
        lec1.name = "Bapak Vivin, M.Kom";
        lec1.activeStatus = false;
        lec1.yearOfEntry = 2015;
        lec1.expertiseCompetency = "Database Systems";
        
        // Calling methods [cite: 269]
        lec1.showInformation();
        lec1.setStatusActive(true);
        lec1.changeSkill("Machine Learning");
        System.out.println("Lecturer 1 Work Time : " + lec1.calculateTimeWork(2026) + " years");
        System.out.println(); // Adding space between objects

        System.out.println("=== OBJECT 2 (Parameterized Constructor) ===");
        // Instantiating object using the parameterized constructor [cite: 267-268]
        Lecturer17 lec2 = new Lecturer17("L002", "Ibu Tika, S.T., M.T.", true, 2020, "Algorithms and Data Structures");
        
        // Calling methods [cite: 269]
        lec2.showInformation();
        System.out.println("Lecturer 2 Work Time : " + lec2.calculateTimeWork(2026) + " years");
}
}
