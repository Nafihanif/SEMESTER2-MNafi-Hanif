package jobsheetX;

import java.util.Scanner;

public class excuseLetterDemo16 {
    public static void main(String[] args) {
        // Create a stack that can hold 10 letters
        excuseLetterStack16 letterStack = new excuseLetterStack16(10);
        Scanner scan = new Scanner(System.in);
        int menu;

        do {
            System.out.println("\n===============================");
            System.out.println("  EXCUSE LETTER MANAGEMENT");
            System.out.println("===============================");
            System.out.println("1. Submit Excuse Letter");
            System.out.println("2. Process Excuse Letter");
            System.out.println("3. View Latest Excuse Letter");
            System.out.println("4. Search for Letter");
            System.out.println("5. Exit");
            System.out.print("Choose (1-5): ");
            menu = scan.nextInt();
            scan.nextLine(); // Clear the buffer

            switch (menu) {
                case 1:
                    // Step 1: Submit Excuse Letter
                    System.out.print("Letter ID: ");
                    String id = scan.nextLine();
                    System.out.print("Student Name: ");
                    String name = scan.nextLine();
                    System.out.print("Class Name: ");
                    String className = scan.nextLine();
                    System.out.print("Type (S: Sick, I: Other): ");
                    char type = scan.next().charAt(0);
                    System.out.print("Duration (days): ");
                    int duration = scan.nextInt();

                    excuseLetter16 newLetter = new excuseLetter16(id, name, className, type, duration);
                    letterStack.push(newLetter);
                    System.out.println("Letter submitted successfully!");
                    break;

                case 2:
                    // Step 2: Process Excuse Letter (Pop)
                    excuseLetter16 processed = letterStack.pop();
                    if (processed != null) {
                        System.out.println("Processing letter from: " + processed.name);
                        System.out.println("ID: " + processed.id + " | Reason: " + processed.typeOfExcuse);
                    }
                    break;

                case 3:
                    // Step 3: View Latest (Peek)
                    excuseLetter16 latest = letterStack.peek();
                    if (latest != null) {
                        System.out.println("The latest letter is from: " + latest.name);
                    } else {
                        System.out.println("The stack is empty.");
                    }
                    break;

                case 4:
                    // Step 4: Search for Letter
                    System.out.print("Enter name to search: ");
                    String searchName = scan.nextLine();
                    letterStack.searchLetter(searchName);
                    break;

                case 5:
                    System.out.println("System closed.");
                    break;

                default:
                    System.out.println("Invalid option!");
            }
        } while (menu != 5);
        
        scan.close();
    }
}
