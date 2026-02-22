package jobsheet2;

public class Lecturer17 {
   String idLecturer;
    String name;
    boolean activeStatus;
    int yearOfEntry;
    String expertiseCompetency;

    // Default Constructor
    public Lecturer17() {
    }

    // Parameterized Constructor
    public Lecturer17(String idLecturer, String name, boolean activeStatus, int yearOfEntry, String expertiseCompetency) {
        this.idLecturer = idLecturer;
        this.name = name;
        this.activeStatus = activeStatus;
        this.yearOfEntry = yearOfEntry;
        this.expertiseCompetency = expertiseCompetency;
    }

    // Method to display information [cite: 256, 286]
    void showInformation() {
        System.out.println("Lecturer ID          : " + idLecturer);
        System.out.println("Lecturer Name        : " + name);
        System.out.println("Active Status        : " + (activeStatus ? "Active" : "Inactive"));
        System.out.println("Year of Entry        : " + yearOfEntry);
        System.out.println("Expertise Competency : " + expertiseCompetency);
        System.out.println("-----------------------------------");
    }

    // Method to set active status [cite: 257, 287-288]
    void setStatusActive(boolean status) {
        activeStatus = status;
        System.out.println("Notification: Active status has been changed to " + (activeStatus ? "Active" : "Inactive"));
    }

    // Method to calculate working time [cite: 258, 289-290]
    int calculateTimeWork(int yearNow) {
        return yearNow - yearOfEntry;
    }

    // Method to change expertise/skill [cite: 259, 291]
    void changeSkill(String skill) {
        expertiseCompetency = skill;
        System.out.println("Notification: Expertise competency has been changed to " + expertiseCompetency);
    }
}
