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
            
            arrayOfSubject[i] = new subject16(code, name, SKS, sumOftime);
        }
    }
}
