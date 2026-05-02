package jobsheetX;
import java.util.Scanner;
public class StudentDemo {
    public static void main(String[] args) {
        studentAssignmentStack16 stack = new studentAssignmentStack16(5);
        Scanner scan = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=================");
            System.out.println("       MENU      ");
            System.out.println("=================");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.print("pilih: ");
            choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
            case 1:
                System.out.print("Name : ");
                String name = scan.nextLine();
                System.out.print("NIM  : ");
                String nim = scan.nextLine();
                System.out.print("Class: ");
                String kls = scan.nextLine();
                Student16 mhs = new Student16(nim, name, kls);
                stack.push(mhs);
                System.out.printf("Tugas %s brehasil dikumpulkan\n",name);
                break;
            case 2:
                Student16 dinilai = stack.pop();
                if (dinilai != null) {
                    System.out.println("Menilai tugas dari " + dinilai.name);
                    System.out.print("Masukkan nilai (0-100): " );
                    int nilai = scan.nextInt();
                    dinilai.grading(nilai);
                    System.out.printf("Nilai Tugas %s adalah %d \n", dinilai.name, nilai);
                }
                break;
            case 3:
                Student16 lihat = stack.peek();
                if (lihat != null){
                    System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.name);
                }
                break;
            case 4: 
                System.out.println("\n=========================");
                System.out.println("Daftar semua tugas");
                System.out.println("=========================");
                System.out.println("Name\tNIM\tkls");
                stack.print();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
            }
        } while (choice >= 1 && choice <= 4 );
        scan.close();
    }
}
