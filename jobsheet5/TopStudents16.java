package jobsheet5;

public class TopStudents16 {
    Student16[] listStudents;
    int idx;

    // Constructor to initialize array size
    public TopStudents16(int size) {
        listStudents = new Student16[size];
        idx = 0;
    }

    // Method to add a student to the array
    public void add(Student16 student) {
        if (idx < listStudents.length) {
            listStudents[idx] = student;
            idx++;
        } else {
            System.out.println("List is full!");
        }
    }

    // Method to display all students
    public void print() {
        for (int i = 0; i < idx; i++) {
            listStudents[i].print();
        }
    }

    // Bubble Sort method to sort students by GPA (Descending)
    public void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                // < sign for descending order (highest GPA first)
                if (listStudents[j].gpa < listStudents[j + 1].gpa) {
                    Student16 temp = listStudents[j];
                    listStudents[j] = listStudents[j + 1];
                    listStudents[j + 1] = temp;
                }
            }
        }
    }
}
