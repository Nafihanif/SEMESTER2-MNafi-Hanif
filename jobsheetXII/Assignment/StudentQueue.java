package jobsheetXII.Assignment;

public class StudentQueue {
    Node front;
    Node rear;
    int size;
    int maxCapacity;

    public StudentQueue(int maxCapacity){
        this.maxCapacity = maxCapacity;
        this.front= null;
        this.rear = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public boolean isFull(){
        return size >= maxCapacity;
    }

    public void clear(){
        front = null;
        rear = null;
        size = 0;
        System.out.println("The queue been completely cleared.");
    }

    public void enqueue(Student std) {
        if (isFull()){
            System.out.println("Sorry, the queue is currently FULL! Cannot add more students.");
            return;
        }
        Node newNode = new Node(std, null);
        if (isEmpty()){
            front = newNode;
            rear = newNode;
        }else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println(std.name + " has succesfully joined the queue.");
    }

    public Student dequeue(){
        if (isEmpty()){
            System.out.println("The queue is Empty! No students to call.");
            return null;
        }

        Student calledStudent =front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }
        size--;

        System.out.println("CALLING NEXT STUDENT: " + calledStudent.name);
        return calledStudent;
    }

    public void printFrontAndRear(){
        if (isEmpty()){
            System.out.println("The queue is empty.");
        } else {
            System.out.println("Front Student : " + front.data.name + " - " + front.data.nim);
            System.out.println("Rear Student : " + rear.data.name + " - " + rear.data.nim);
        }
    }

    public void printSize(){
        System.out.println("Total student currently in queue: " + size);
    }

    // Method to display all students currently in the queue
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("The queue is currently empty.");
        } else {
            Node temp = front; 
            System.out.println("\n=== LIST OF STUDENTS IN QUEUE ===");
            int queueNumber = 1;
            
            while (temp != null) {
                System.out.println(queueNumber + ". " + temp.data.name + " (" + temp.data.nim + ")");
                temp = temp.next; 
                queueNumber++;
            }
            System.out.println("-----------------------------------");
        }
    }
}
