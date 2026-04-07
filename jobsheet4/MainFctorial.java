package jobsheet4;
import java.util.Scanner;
public class MainFctorial {
    public static void main(String[] args) {
        System.out.println("===== FACTORIAL CALCULATOR =====");
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = input.nextInt();

        Factorial fk = new Factorial();
    
    System.out.println("The factorial of " + num + " using BF : " + fk.factorialIBF(num));
    System.out.println("The factorial of " + num + " using DC : " + fk.factorialDC(num));
    input.close();
    }
}
