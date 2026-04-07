package jobsheet5;

import java.util.Scanner;
    
public class LecturerMain16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LecturerData16 data = new LecturerData16();

        int choice;
        do {
            System.out.println("\n=== LECTURER DATA MENU ===");
            System.out.println("1. Add Data");
            System.out.println("2. Display Data");
            System.out.println("3. Sort ASC (Youngest to Oldest) - Bubble Sort");
            System.out.println("4. Sort DSC (Oldest to Youngest) - Selection Sort");
            System.out.println("5. Exit");
            System.out.print("Choose menu (1-5): ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Is Male? (true/false): ");
                    boolean gender = scanner.nextBoolean();
                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();
                    
                    // Add to array
                    data.add(new Lecturer16(id, name, gender, age));
                    System.out.println("Data successfully added!");
                    break;
                case 2:
                    System.out.println("\n--- All Lecturer Data ---");
                    data.print();
                    break;
                case 3:
                    data.sortingASC();
                    System.out.println("\n--- Data Sorted ASC by Age (Bubble Sort) ---");
                    data.print();
                    break;
                case 4:
                    data.sortingDSC();
                    System.out.println("\n--- Data Sorted DSC by Age (Selection Sort) ---");
                    data.print();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
        
        scanner.close();
    }
}
