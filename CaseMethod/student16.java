package CaseMethod;

public class student16 {
    String id;
    String name;
    String studyProgram;

    // 1. contruction for initialize student data 
    public student16(String id, String name, String studyProgram ){
        this.id = id;
        this.name = name;
        this.studyProgram = studyProgram;
    }

    // 2. method to display student information 
    public void showStudent(){
        System.out.printf("ID: %-6s | Name: %-10s | Program: %s\n", id, name, studyProgram);
    }
}
