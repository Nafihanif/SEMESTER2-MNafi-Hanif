package jobsheet3;
import java.util.Scanner;
public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student16[] arrayOfStudent =new Student16[3];
        String dummy;

        for (int i = 0; i <3; i++){
            arrayOfStudent[i] = new Student16();
            
            System.out.println("ENTER STUDENT DATA (" + (i+1) + ")");
            System.out.print("STUDENT NIM   : ");
            arrayOfStudent[i].NIM = sc.nextLine();
            System.out.print("STUDENT NAME  : ");
            arrayOfStudent[i].Name = sc.nextLine();
            System.out.print("STUDENT CLASS : ");
            arrayOfStudent[i].Class =  sc.nextLine();
            System.out.print("STUDENT GPA   : ");
            dummy = sc.nextLine();  
            arrayOfStudent[i].RGB = Float.parseFloat(dummy);
            // arrayOfStudent[i].RGB = sc.nextFloat(); ???
            System.out.println("----------------------------------");
        }

        for (int i = 0; i<3; i++){
            System.out.println("STUDENT DATA (" + (i+1) + ")");
            arrayOfStudent[i].printInfo();
            System.out.println("----------------------------------");
        }
        // for (int i = 0; i <3; i++){
        //     System.out.println("STUDENT DATA (" + (i+1) + ")");
        //     System.out.println("NIM      : " + arrayOfStudent[i].NIM);
        //     System.out.println("Name     : " + arrayOfStudent[i].Name);
        //     System.out.println("Class    : " + arrayOfStudent[i].Class);
        //     System.out.println("GPA      : " + arrayOfStudent[i].RGB);
        //     System.out.println("----------------------------------");
        // }
        sc.close();
    }
}
