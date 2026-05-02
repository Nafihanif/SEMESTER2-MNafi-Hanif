package jobsheetX;
import java.util.Scanner;
public class StudentDemo {
    public static void main(String[] args) {
        studentAssignmentStack16 stack = new studentAssignmentStack16(5);
        Scanner scan = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=================");
            System.out.println("====== MENU =====");
            System.out.println("=================");
            System.out.println("1. Submitting Assignments");
            System.out.println("2. Grading Assignments");
            System.out.println("3. View Top Assignments");
            System.out.println("4. View Assignments List");
            System.out.println("5. Looking at the first Assignment that was turned in ");
            System.out.print("Select : ");
            choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
            case 1:
                System.out.print("Name : ");
                String name = scan.nextLine();
                System.out.print("NIM  : ");
                String nim = scan.nextLine();
                System.out.print("Class: ");
                String kls = scan.nextLine();
                Student16 mhs = new Student16(nim, name, kls);
                stack.push(mhs);
                System.out.printf("%s's Assignments successfully collected\n",name);
                break;
            case 2:
                Student16 dinilai = stack.pop();
                if (dinilai != null) {
                    System.out.println("Grading Assignments from " + dinilai.name);
                    System.out.print("Add grade (0-100): " );
                    int nilai = scan.nextInt();
                    dinilai.grading(nilai);
                    System.out.printf("Assignment Grade %s is %d \n", dinilai.name, nilai);
                    String binary = stack.convertToBinary(nilai);
                    System.out.printf("Assigcmnet grade in binary is %s\n", binary);
                }
                break;
            case 3:
                Student16 lihat = stack.peek();
                if (lihat != null){
                    System.out.println("The final assignment was submitted by " + lihat.name);
                }
                break;
            case 4: 
                System.out.println("=========================");
                System.out.println("List of all assignment");
                System.out.println("=========================");
                System.out.println("Name\tNIM\tkls");
                stack.print();
                break;
            case 5:
                Student16 first = stack.peekFirst();
                if (first != null) {
                    System.out.println("The first assignment was submitted by: " + first.name);
                }
                break;
            default:
                System.out.println("Invalid selection.");
            }
        } while (choice >= 1 && choice <= 5 );
        scan.close();
    }
}
