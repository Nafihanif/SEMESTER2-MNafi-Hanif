package jobsheet6;
import java.util.Scanner;
public class MainStudent {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        SearchStudent data = new SearchStudent();
        System.out.print("Enter the number of students: ");
        int amountStudent = s.nextInt();

        System.out.println("-----------------------------");
        System.out.println("input student accordingly from smallet NIM");
        for (int i = 0; i < amountStudent; i++){
        System.out.println("-------------");
        System.out.print("NIM\t: ");
        int nim = s.nextInt();
        System.out.print("Name\t: ");
        String name = s1.nextLine();
        System.out.print("Age\t: ");
        int age = s.nextInt();
        System.out.print("GPA\t: ");
        double gpa = s.nextDouble();

        Students std = new Students(nim, age, name, gpa);
        data.add(std);
    }

        System.out.println("----------------------------");
        System.out.println("Entire Student Data ");
        data.display();

        System.out.println("____________________________");
        System.out.println("____________________________");
        System.out.print("search student by NIM: ");
        int search = s.nextInt();
        System.out.println("Using Seuential Search");
        int position = data.findSeqSearch(search);

        data.showPosition(search, position);

        data.showData(search, position);
        
        System.out.println("=============================");
        System.out.print("search student by NIM: ");
        System.out.println("Using binary Search");
        int positionl = data.FindBinarySearch(search, 0, amountStudent - 1);

        data.showPosition(search, positionl);

        data.showData(search, positionl);
        
    s.close();
    s1.close();
    }
}
