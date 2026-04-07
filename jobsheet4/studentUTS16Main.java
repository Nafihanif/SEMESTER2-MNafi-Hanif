package jobsheet4;

public class studentUTS16Main {
    // 1. Find the highest Midterm Score (UTS) using the Divide and Conquer approach.
    public static int highestUtsDC(studentUTS16[] arr, int l, int r) {
        if (l == r) {
            return arr[l].uts;
        }
        int mid = (l + r) / 2;
        int leftHighest = highestUtsDC(arr, l, mid);
        int rightHighest = highestUtsDC(arr, mid + 1, r);
        return Math.max(leftHighest, rightHighest); 
    }

    // 2. Find the lowest Midterm Score (UTS) using the Divide and Conquer approach.
    public static int lowestUtsDC(studentUTS16[] arr, int l, int r) {
        if (l == r) {
            return arr[l].uts;
        }
        int mid = (l + r) / 2;
        int leftLowest = lowestUtsDC(arr, l, mid);
        int rightLowest = lowestUtsDC(arr, mid + 1, r);
        return Math.min(leftLowest, rightLowest);
    }

    // 3. Calculate the average Final Score (UAS) of all students using the Brute Force approach.
    public static double averageUasBF(studentUTS16[] arr) {
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i].uas;
        }
        return total / arr.length;
    }

    public static void main(String[] args) {
        // Data input based on the Assignment table
        studentUTS16[] students = new studentUTS16[8];
        students[0] = new studentUTS16("Ahmad", "220101001", 2022, 78, 82);
        students[1] = new studentUTS16("Budi", "220101002", 2022, 85, 88);
        students[2] = new studentUTS16("Cindy", "220101003", 2021, 90, 87);
        students[3] = new studentUTS16("Dian", "220101004", 2021, 76, 79);
        students[4] = new studentUTS16("Eko", "220101005", 2023, 92, 95);
        students[5] = new studentUTS16("Fajar", "220101006", 2020, 88, 85);
        students[6] = new studentUTS16("Gina", "220101007", 2023, 80, 83);
        students[7] = new studentUTS16("Hadi", "220101008", 2020, 82, 84);

        System.out.println("=== ASSIGNMENT RESULTS ===");
        
        int highestUts = highestUtsDC(students, 0, students.length - 1);
        int lowestUts = lowestUtsDC(students, 0, students.length - 1);
        double avgUas = averageUasBF(students);

        System.out.println("Highest Midterm Score (UTS) : " + highestUts);
        System.out.println("Lowest Midterm Score (UTS)  : " + lowestUts);
        System.out.println("Average Final Score (UAS)   : " + avgUas);
    }
}
