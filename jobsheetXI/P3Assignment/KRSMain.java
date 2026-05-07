package jobsheetXI.P3Assignment;

import java.util.Scanner;

public class KRSMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Requirement: Maximum queue size is 10
        KRSQueue queue = new KRSQueue(10); 
        int choice;

        do {
            System.out.println("\n=== KRS Approval Menu ===");
            System.out.println("1. Enqueue Student");
            System.out.println("2. Process KRS (Approves 2 students)");
            System.out.println("3. Display All in Queue");
            System.out.println("4. Display First Two Students");
            System.out.println("5. Display Last Student (Rear)");
            System.out.println("6. View KRS Statistics");
            System.out.println("7. Clear Queue");
            System.out.println("0. Exit");
            System.out.print("Choose a menu: ");
            
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Name  : ");
                    String name = sc.nextLine();
                    System.out.print("Study Program : ");
                    String studyProgram = sc.nextLine();
                    System.out.print("Class : ");
                    String className = sc.nextLine();
                    Student std = new Student(nim, name, studyProgram, className);
                    queue.enqueue(std);
                    break;
                case 2:
                    queue.processKRS();
                    break;
                case 3:
                    queue.printAll();
                    break;
                case 4:
                    queue.printFirstTwo();
                    break;
                case 5:
                    queue.peekRear();
                    break;
                case 6:
                    queue.printStats();
                    break;
                case 7:
                    queue.clear();
                    break;
                case 0:
                    System.out.println("System shutting down...");
                    break;
                default:
                    System.out.println("Invalid menu selection!");
            }
        } while (choice != 0);
    }
}