package jobsheet4;

public class studentUTS16 {
    String name;
    String nim; // Student ID (NIM)
    int yearOfAdmission;
    int uts; // Midterm Score (UTS)
    int uas; // Final Score (UAS)

    // Parameterized Constructor
    public studentUTS16(String name, String nim, int yearOfAdmission, int uts, int uas) {
        this.name = name;
        this.nim = nim;
        this.yearOfAdmission = yearOfAdmission;
        this.uts = uts;
        this.uas = uas;
    }
}
