package jobsheet3;
import java.util.Scanner;
public class subjectDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== INPUT SUBJECT DATA =====");
        System.out.print("INPUT SUM OF SUBJECT DO YOU NEED : ");
        int sumOfSubject = scanner.nextInt();
        scanner.nextLine(); 
        // Consume the newline character after reading the integer
        
        subject16 []arrayOfSubject = new subject16[sumOfSubject];
        String code, name, dummy;
        int SKS, sumOftime;

        for (int i =0; i < sumOfSubject; i++){
            System.out.println("ENTER SUBJECT DATA (" + (i+1) + "):");
            System.out.print("SUBJECT CODE : ");
            code = scanner.nextLine();
            System.out.print("SUBJECT NAME : ");
            name = scanner.nextLine();
            System.out.print("SUBJECT SKS  : ");
            dummy = scanner.nextLine();
            SKS = Integer.parseInt(dummy);
            System.out.print("SUBJECT SUM OF TIME : ");
            dummy = scanner.nextLine();
            sumOftime = Integer.parseInt(dummy);
            System.out.println("----------------------------------"); 

            arrayOfSubject[i] = new subject16();
            arrayOfSubject[i].addData(code, name, SKS, sumOftime);
            }

            System.out.println("\n===== SUBJECT DATA RESULT =====");
            for (int i = 0; i < sumOfSubject; i++){
                System.out.println("SUBJECT DATA (" + (i+1) + "):");
                
                // call method printInfo to display subject data
                arrayOfSubject[i].printInfo();
            }        
        scanner.close();
    }
}
