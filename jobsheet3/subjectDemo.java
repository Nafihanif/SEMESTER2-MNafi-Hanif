package jobsheet3;
import java.util.Scanner;
public class subjectDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        subject16 []arrayOfSubject = new subject16[3];
        String code, name, dummy;
        int SKS, sumOftime;
        
        for (int i =0; i < 3; i++){
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
            for (int i = 0; i < 3; i++){
                System.out.println("SUBJECT DATA (" + (i+1) + "):");
                
                // call method printInfo to display subject data
                arrayOfSubject[i].printInfo();
            }

        //     for (int i = 0; i < 3; i++){
        //         System.out.println("SUBJECT DATA (" + (i+1) + "):");
        //         System.out.println("SUBJECT CODE : " + arrayOfSubject[i].code);
        //         System.out.println("SUBJECT NAME : " + arrayOfSubject[i].name);
        //         System.out.println("SUBJECT SKS  : " + arrayOfSubject[i].SKS);
        //         System.out.println("SUBJECT SUM OF TIME : " + arrayOfSubject[i].sumOftime);
        //         System.out.println("----------------------------------");
        // }
        
        scanner.close();
    }
}
