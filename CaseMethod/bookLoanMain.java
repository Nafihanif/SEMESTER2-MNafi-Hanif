package CaseMethod;
import java.util.Scanner;
public class bookLoanMain {
   
    // Method to sort loans by Fine (Descending) using INSERTION SORT
    public static void sortLoansByFine(loan16[] loans) {
        for (int i = 1; i < loans.length; i++) {
            loan16 temp = loans[i];
            int j = i;
            // '<' for descending order
            while (j > 0 && loans[j - 1].fine < temp.fine) {
                loans[j] = loans[j - 1];
                j--;
            }
            loans[j] = temp;
        }
    }

    // Helper Method: Sort loans by Student ID (Ascending) using INSERTION SORT
    // (This is required before performing a Binary Search)
    public static void sortLoansByID(loan16[] loans) {
        for (int i = 1; i < loans.length; i++) {
            loan16 temp = loans[i];
            int j = i;
            // compareTo > 0 for ascending alphabetical order
            while (j > 0 && loans[j - 1].std.id.compareTo(temp.std.id) > 0) {
                loans[j] = loans[j - 1];
                j--;
            }
            loans[j] = temp;
        }
    }

    // Method to search loan by Student ID using BINARY SEARCH
    public static void searchLoanByID(loan16[] loans, String targetId) {
        sortLoansByID(loans); // Ensure array is sorted by ID first
        
        int left = 0;
        int right = loans.length - 1;
        int foundIdx = -1;

        // Binary Search Logic
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = loans[mid].std.id.compareTo(targetId);

            if (cmp == 0) {
                foundIdx = mid; // Match found!
                break;
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // Display results
        if (foundIdx != -1) {
            System.out.println("\n--- Loan Data Found for ID: " + targetId + " ---");
            // Since one student might borrow multiple books, we scan left and right 
            // of the found index to print all their loans.
            int startIdx = foundIdx;
            while (startIdx > 0 && loans[startIdx - 1].std.id.equals(targetId)) {
                startIdx--;
            }
            while (startIdx < loans.length && loans[startIdx].std.id.equals(targetId)) {
                loans[startIdx].showLoan();
                startIdx++;
            }
        } else {
            System.out.println("\nNo loan data found for Student ID: " + targetId);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Initialize Dummy Data [cite: 415-420]
        student16[] students = {
            new student16("22001", "Abdul", "Informatics Engineering"),
            new student16("22002", "Bestari", "Informatics Engineering"),
            new student16("22003", "Gandi", "Business Information System")
        };

        book16[] books = {
            new book16("B001", "Algorithm", 2020),
            new book16("B002", "Database", 2019),
            new book16("B003", "Programming", 2021),
            new book16("B004", "Physics", 2024)
        };

        loan16[] loans = {
            new loan16(students[0], books[0], 7),  // Abdul, Algorithm, 7 days
            new loan16(students[1], books[1], 3),  // Bestari, Database, 3 days
            new loan16(students[2], books[2], 10), // Gandi, Programming, 10 days
            new loan16(students[2], books[3], 6),  // Gandi, Physics, 6 days
            new loan16(students[0], books[1], 4)   // Abdul, Database, 4 days
        };

        // 2. Interactive Menu
        int menu;
        do {
            System.out.println("\n==============================================");
            System.out.println("   JTI READING ROOM LOAN MANAGEMENT SYSTEM    ");
            System.out.println("==============================================");
            System.out.println("1. Display Book and Student Data");
            System.out.println("2. Display All Loan Data");
            System.out.println("3. Sort Loan Data by Largest Fine (Descending)");
            System.out.println("4. Search Loan Data by Student ID");
            System.out.println("5. Exit");
            System.out.print("Select menu (1-5): ");
            menu = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (menu) {
                case 1:
                    System.out.println("\n--- STUDENT DATA ---");
                    for (student16 s : students) s.showStudent();
                    System.out.println("\n--- BOOK DATA ---");
                    for (book16 b : books) b.showBook();
                    break;
                case 2:
                    System.out.println("\n--- ALL LOAN DATA ---");
                    for (loan16 l : loans) l.showLoan();
                    break;
                case 3:
                    sortLoansByFine(loans);
                    System.out.println("\n--- LOAN DATA SORTED BY LARGEST FINE ---");
                    for (loan16 l : loans) l.showLoan();
                    break;
                case 4:
                    System.out.print("Enter Student ID to search (e.g., 22001): ");
                    String searchId = sc.nextLine();
                    searchLoanByID(loans, searchId);
                    break;
                case 5:
                    System.out.println("Thank you for using the system!");
                    break;
                default:
                    System.out.println("Invalid menu selection!");
            }
        } while (menu != 5);

        sc.close();
    }
}

