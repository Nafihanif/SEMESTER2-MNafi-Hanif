package jobsheet5;

public class LecturerData16 {
    Lecturer16[] lecturerData = new Lecturer16[10]; // Array size 10 
    int idx = 0;

    // Method to add a new lecturer 
    public void add(Lecturer16 dsn) {
        if (idx < lecturerData.length) {
            lecturerData[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data is full!");
        }
    }

    // Method to display all lecturers 
    public void print() {
        if (idx == 0) {
            System.out.println("No data available.");
            return;
        }
        for (int i = 0; i < idx; i++) {
            lecturerData[i].print();
        }
    }

    // Sort ASC by age using Bubble Sort [cite: 92, 95]
    public void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (lecturerData[j].age > lecturerData[j + 1].age) {
                    // Swap elements
                    Lecturer16 temp = lecturerData[j];
                    lecturerData[j] = lecturerData[j + 1];
                    lecturerData[j + 1] = temp;
                }
            }
        }
    }

    // Sort DSC by age using Selection Sort [cite: 93, 95]
    public void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int maxIndex = i; // Assume the current index has the maximum age
            for (int j = i + 1; j < idx; j++) {
                if (lecturerData[j].age > lecturerData[maxIndex].age) {
                    maxIndex = j; // Update maxIndex if a bigger age is found
                }
            }
            // Swap elements
            Lecturer16 temp = lecturerData[maxIndex];
            lecturerData[maxIndex] = lecturerData[i];
            lecturerData[i] = temp;
        }
    }
}
