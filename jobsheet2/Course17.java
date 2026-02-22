package jobsheet2;

public class Course17 {
    // Attributes
    String codeSub;
    String nameSub;
    int sks;
    int numberOfHours;

    public Course17() {
        // This is a constructor without parameters, it will be called when an object is created without passing any arguments
    }

    public Course17(String codeSub, String nameSub, int sks, int numberOfHours) {
        this.codeSub = codeSub;
        this.nameSub = nameSub;
        this.sks = sks;
        this.numberOfHours = numberOfHours;

        // If the parameter name is the same as the attribute name, then to refer to the attribute
        // variable the syntax of this is added in front of the attribute name
    }
 
    void displayInformation() {
        System.out.println("Code Subject    : " + codeSub);
        System.out.println("Name Subject    : " + nameSub);
        System.out.println("SKS             : " + sks);
        System.out.println("Number of Hours : " + numberOfHours);
        System.out.println("-----------------------------------");
    }   

    void changesks (int newsks) {
        sks = newsks;
        System.out.println("SKS has been updated to            : " + sks);
    }

    void addTime (int hours) {
        numberOfHours += hours;
        System.out.println("Number of Hours has been updated to: " + numberOfHours);

    }
    
    void reduceHours (int hours) {
        if (numberOfHours >= hours) { 
            numberOfHours -= hours;
            System.out.println("Notification: Hours successfully deducted. Current total hours: " + numberOfHours);
        } else {
            System.out.println("Warning: Deduction failed! The initial number of hours is insufficient.");
        }
    }
}