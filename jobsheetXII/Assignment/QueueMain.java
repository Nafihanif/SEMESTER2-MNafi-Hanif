package jobsheetXII.Assignment;
import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StudentQueue queue = new StudentQueue(5);
        int menu;

        do{
            System.out.println("\n=== STUDENT SERVICE QUEUE SYSTEM ===");
            System.out.println("1. Register Student (Enqueue)");
            System.out.println("2. Call Next Student (Dequeue)");
            System.out.println("3. View First and Last in Line");
            System.out.println("4. View Total Students in Line");
            System.out.println("5. Check if Queue is Empty/Full");
            System.out.println("6. Clear Queue");
            System.out.println("7. View All Students in Queue");
            System.out.println("0. Exit");
            System.out.print("Choose operation : ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    if (!queue.isFull()) {
                        System.out.print("Enter NIM  : ");
                        String nim = sc.nextLine();
                        System.out.print("Enter Name : ");
                        String name = sc.nextLine();
                        Student newStudent = new Student(nim, name);
                        queue.enqueue(newStudent);
                    } else {
                        System.out.println("Queue is full! Please wait until someone is called.");
                    }
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.printFrontAndRear();
                    break;
                case 4:
                    queue.printSize();
                    break;
                case 5:
                    System.out.println("Is Student queue empty | " + queue.isEmpty());
                    System.out.println("Is Student queue full  | " + queue.isFull());
                    break;
                case 6:
                    queue.clear();
                    break;
                case 7:
                    queue.printQueue();
                    break;
                case 0:
                    System.out.println("Exiting system...");
                    break;
                default:
                    System.out.println("Invalid menu choice!");
            }
        } while (menu != 0);
        sc.close();
    }    
}
