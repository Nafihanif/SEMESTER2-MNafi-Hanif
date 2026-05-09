package jobsheetXII.Assignment;

public class Student {
    String nim;
    String name;

    public Student(String nim, String name){
        this.nim = nim;
        this.name = name;
    }

    public void print(){
        System.out.println("NIM: " + nim + "Name: " + name);
    }

}
