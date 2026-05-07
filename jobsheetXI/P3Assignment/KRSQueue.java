package jobsheetXI.P3Assignment;

public class KRSQueue {
    Student[] data;
    int front, rear, size, max;
    int processedCount; // How many students completed KRS
    int totalRegistered; // To track the 30 student limit for DPA

    public KRSQueue(int n) {
        max = n;
        data = new Student[max];
        size = 0;
        front = 0;
        rear = -1;
        processedCount = 0;
        totalRegistered = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == max;
    }

    void clear() {
        if (!isEmpty()) {
            front = 0;
            rear = -1;
            size = 0;
            System.out.println("Queue has been cleared.");
        } else {
            System.out.println("Queue is already empty.");
        }
    }

    void enqueue(Student dt) {
        // Check DPA Quota first
        if (totalRegistered >= 30) {
            System.out.println("ERROR: The Academic Advisor (DPA) has reached the maximum limit of 30 students.");
            return;
        }
        
        if (isFull()) {
            System.out.println("Queue is full! Please wait.");
            return;
        }

        rear = (rear + 1) % max;
        data[rear] = dt;
        size++;
        totalRegistered++; // Add to total DPA quota
        System.out.println(dt.name + " joined the queue successfully.");
    }

    Student dequeue() {
        if (isEmpty()) {
            return null;
        }
        Student dt = data[front];
        front = (front + 1) % max;
        size--;
        return dt;
    }

    // Requirement: Process 2 students at once
    void processKRS() {
        if (isEmpty()) {
            System.out.println("No students in the queue to process.");
            return;
        }

        System.out.println("=== Processing KRS ===");
        
        // Process 1st student
        Student s1 = dequeue();
        System.out.print("1. ");
        s1.print();
        processedCount++;

        // Process 2nd student (if available)
        if (!isEmpty()) {
            Student s2 = dequeue();
            System.out.print("2. ");
            s2.print();
            processedCount++;
        } else {
            System.out.println("(Only 1 student was in the queue to process)");
        }
        System.out.println("======================");
    }

    // Requirement: Show first two students
    void printFirstTwo() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("First two students in line:");
        System.out.print("1. ");
        data[front].print();

        if (size > 1) {
            int secondElement = (front + 1) % max;
            System.out.print("2. ");
            data[secondElement].print();
        }
    }

    // Requirement: Show the last student
    void peekRear() {
        if (!isEmpty()) {
            System.out.println("Last student in queue:");
            data[rear].print();
        } else {
            System.out.println("Queue is empty.");
        }
    }

    void printAll() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        int i = front;
        while (i != rear) {
            data[i].print();
            i = (i + 1) % max;
        }
        data[i].print();
        System.out.println("Current queue size: " + size);
    }

    // Requirement: Print all statistics
    void printStats() {
        System.out.println("--- KRS Statistics ---");
        System.out.println("Total students currently in queue: " + size);
        System.out.println("Total students processed (KRS Approved): " + processedCount);
        System.out.println("Total students not yet processed (in queue): " + size);
        System.out.println("Total DPA quota used: " + totalRegistered + " / 30");
        System.out.println("----------------------");
    }
}