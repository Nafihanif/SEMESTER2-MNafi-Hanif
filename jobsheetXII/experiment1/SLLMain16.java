package jobsheetXII.experiment1;

public class SLLMain16 {
    public static void main(String[] args) {
        SingleLinkedList16 sll = new SingleLinkedList16();

        Student16 std1 = new Student16("001", "Student 1", "TI-1I",3.89);
        Student16 std2 = new Student16("002", "Student 2", "TI-1I",3.45);
        Student16 std3 = new Student16("003", "Student 3", "TI-1I",3.20);
        Student16 std4 = new Student16("004", "Student 4", "TI-1I",3.00);

        sll.print();
        sll.addFirst(std4);
        sll.print();
        sll.addLast(std1);
        sll.print();
        sll.insertAfter(std3, "Student 4");
        sll.insertAt(2, std2);
        sll.print();
    }
}
