package jobsheet2;

public class CourseMain17 {
    public static void main(String[] args) {
        
        System.out.println("=== OBJECT 1 (Default Constructor) ===");
        Course17 cr1 = new Course17();
        cr1.codeSub = "ALG101";
        cr1.nameSub = "Algorithm And Data Structure";
        cr1.sks = 3;
        cr1.numberOfHours = 6;

        cr1.displayInformation();
        cr1.changesks(4);
        cr1.addTime(2);
        cr1.reduceHours(10);   
        cr1.displayInformation();     
        
        System.out.println("\n=== OBJECT 2 (Parameterized Constructor) ===");   

        Course17 cr2 = new Course17("BD101", "BasisData", 2, 4);
        
        cr2.displayInformation();
        cr2.reduceHours(2);
        cr2.displayInformation();
    }
}
