package jobsheet3;
import java.util.Scanner;
public class lecturerDemo16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("===== INPUT LECTURER DATA =====");
        System.out.print("INPUT SUM OF LECTURER DO YOU WANT TO INPUT : ");
        int sumOfLecturer = sc.nextInt();
        sc.nextLine(); // Consume the newline character after reading the integer

        // initiate an array of lecturer16 objects with the size of sumOfLecturer
        lecturer16 []arrayOfLecturer = new lecturer16[sumOfLecturer];

        System.out.println("===== INPUT LECTURER DATA =====");
        for (int i = 0; i < sumOfLecturer; i++) {
            System.out.println("Data lecture (" + (i + 1) + ")");
            System.out.print("CODE             : ");
            String code = sc.nextLine();

            System.out.print("NAME             : ");
            String name = sc.nextLine();

            System.out.print("GENDER Man/Woman : ");
            String inputGender = sc.nextLine();
            boolean gender = inputGender.equalsIgnoreCase("Man");

            System.out.print("AGE              : ");
            int age = sc.nextInt();
            sc.nextLine(); 
            // Consume the newline character after reading the integer

            System.out.println("----------------------------------");

            arrayOfLecturer[i] = new lecturer16(code, name, gender, age);
        }

        // Displaying the results 
        // calling the methods to process the data
        System.out.println("\n===============================================\n");
        lecturerData16 dataProcessor = new lecturerData16();
        dataProcessor.allLecturerData(arrayOfLecturer);
        dataProcessor.numberOfLecturersByGender(arrayOfLecturer);
        dataProcessor.averageAgeOfLecturersEachGender(arrayOfLecturer);
        dataProcessor.oldestLecturer(arrayOfLecturer);
        dataProcessor.youngestLecturer(arrayOfLecturer);

        sc.close();
    }   
}
