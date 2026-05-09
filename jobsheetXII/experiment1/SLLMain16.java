package jobsheetXII.experiment1;
import java.util.Scanner;
public class SLLMain16 {
    public static void main(String[] args) {
        SingleLinkedList16 sll = new SingleLinkedList16();
        Scanner sc = new Scanner(System.in);
        String confirmation;

        System.out.println("=== DYNAMIC STUDENT DATA INPUT SYSTEM ===");

        do {
            System.out.println("\n--- Enter New Student Data ---");
            System.out.print("Enter NIM   : ");
            String nim = sc.nextLine();

            System.out.print("Enter Name  : ");
            String name = sc.nextLine();

            System.out.print("Enter Class : ");
            String className = sc.nextLine();

            System.out.print("Enter GPA   : ");
            double gpa = sc.nextDouble();
            sc.nextLine();

            Student16 newStd = new Student16(nim, name, className, gpa);

            sll.addLast(newStd);

            System.out.print("\nDo you want to add more student data? (y/n): ");
            confirmation = sc.nextLine();
        } while(confirmation.equalsIgnoreCase("y"));

        System.out.println("\n==================================");
        System.out.println("== ALL LINKED LIST DATA SUMMARY ==");
        System.out.println("==================================");
        sll.print();

        sc.close();

        // Student16 std1 = new Student16("001", "Student 1", "TI-1I",3.89);
        // Student16 std2 = new Student16("002", "Student 2", "TI-1I",3.45);
        // Student16 std3 = new Student16("003", "Student 3", "TI-1I",3.20);
        // Student16 std4 = new Student16("004", "Student 4", "TI-1I",3.00);

        // sll.print();
        // sll.addFirst(std4);
        // sll.print();
        // sll.addLast(std1);
        // sll.print();
        // sll.insertAfter(std3, "Student 4");
        // sll.insertAt(2, std2);
        // sll.print();
    }
}
