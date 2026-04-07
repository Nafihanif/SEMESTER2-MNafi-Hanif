package jobsheet5;

public class StudentDemo16 {
    public static void main(String[] args) {
        TopStudents16 topStudents = new TopStudents16(5);

        // Adding student data
        topStudents.add(new Student16("2201", "Alice", "A", 3.9));
        topStudents.add(new Student16("2202", "Bob", "B", 3.7));
        topStudents.add(new Student16("2203", "Charlie", "C", 3.8));
        topStudents.add(new Student16("2204", "David", "D", 3.6));
        topStudents.add(new Student16("2205", "Eve", "E", 4.0));

        // Display original list
        System.out.println("Original student list:");
        topStudents.print();

        // Sorting students by GPA using Bubble Sort
        topStudents.bubbleSort();
        System.out.println("\nSorted student list (by GPA, descending):");
        topStudents.print();
    }
}
