package jobsheetXII.experiment1;

public class Student16 {
    String nim, name, className;
    double gpa;

    public Student16() {
    }

    public Student16(String nm, String nama, String kls, double ip) {
        nim = nm;
        name = nama;
        className = kls;
        gpa = ip;
    }

    void print(){
        System.out.println(nim+" - "+name+" - "+className+" - "+gpa);
    }
}
