package jobsheet1;
import java.util.Scanner;

public class finalGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("prgram to calculate final grade");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("================================");

        System.out.print("Enter the assignment grade: ");
        double assignment = sc.nextDouble();
        System.out.print("Enter the quiz grade: ");
        double quiz = sc.nextDouble();
        System.out.print("Enter the midterm grade: ");
        double midterm = sc.nextDouble();
        System.out.print("Enter the final exam grade: ");
        double finalExam = sc.nextDouble();
        System.out.println("================================");
        System.out.println("================================");

        if (assignment < 0 || assignment > 100 || quiz < 0 || quiz > 100 || midterm < 0 || midterm > 100 || finalExam < 0 || finalExam > 100) {
            System.out.println("Invalid input. Grades must be between 0 and 100.");
        } else {
            double finalgrade = (0.2 * assignment) + (0.2 * quiz) + (0.3 * midterm) + (0.3 * finalExam);
            String letterGrade;
            if (finalgrade > 80) {
                letterGrade = "A";
            } else if (finalgrade > 73) {
                letterGrade = "B+";
            } else if (finalgrade > 65) {
                letterGrade = "B";
            } else if (finalgrade > 60) {
                letterGrade = "C+";
            } else if (finalgrade > 50) {
                letterGrade = "C";
            } else if (finalgrade > 39) {
                letterGrade = "D";
            }else {
                letterGrade = "E";
            }

            System.out.println("Student Name: " + name);
            System.out.println("Final Grade : " + finalgrade);
            System.out.println("Letter Grade: " + letterGrade);
            System.out.println("================================");
            System.out.println("================================");
              
            if (letterGrade.equals("D") || letterGrade.equals("E")) {
                System.out.println("You have failed the course.");
            } else {
                System.out.println("Congratulations! You have passed the course.");
            }

        }
        sc.close();
    }
}