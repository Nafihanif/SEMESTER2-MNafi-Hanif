package jobsheet3;

public class StudentDemo {
    public static void main(String[] args) {
        Student18[] arrayOfStudent =new Student18[3];
        arrayOfStudent[0] = new Student18();
        arrayOfStudent[0].NIM = "244107060033";
        arrayOfStudent[0].Name = "AGNES TITANIA KINANTI";
        arrayOfStudent[0].Class = "SIB-1E";
        arrayOfStudent[0].RGB = (float) 3.75;

        arrayOfStudent[1] = new Student18();
        arrayOfStudent[1].NIM = "2341720172";
        arrayOfStudent[1].Name = "ACHMAD MAULANA HAMZAH";
        arrayOfStudent[1].Class = "TI-2A";
        arrayOfStudent[1].RGB = (float) 3.36;

        arrayOfStudent[2] = new Student18();
        arrayOfStudent[2].NIM = "244107023006";
        arrayOfStudent[2].Name = "DIRHAMAWAN PUTRNATO";
        arrayOfStudent[2].Class = "TI-2E";
        arrayOfStudent[2].RGB = (float) 3.80;

        System.out.println("NIM      : " + arrayOfStudent[0].NIM);
        System.out.println("Name     : " + arrayOfStudent[0].Name);
        System.out.println("Class    : " + arrayOfStudent[0].Class);
        System.out.println("GPA      : " + arrayOfStudent[0].RGB);
        System.out.println("----------------------------------");
        System.out.println("NIM      : " + arrayOfStudent[1].NIM);
        System.out.println("Name     : " + arrayOfStudent[1].Name);
        System.out.println("Class    : " + arrayOfStudent[1].Class);
        System.out.println("GPA      : " + arrayOfStudent[1].RGB);
        System.out.println("----------------------------------");
        System.out.println("NIM      : " + arrayOfStudent[2].NIM);
        System.out.println("Name     : " + arrayOfStudent[2].Name);
        System.out.println("Class    : " + arrayOfStudent[2].Class);
        System.out.println("GPA      : " + arrayOfStudent[2].RGB);
        System.out.println("----------------------------------");
    }
}
