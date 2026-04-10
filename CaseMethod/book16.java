package CaseMethod;

public class book16 {
String code;
String title;
int year;

// 1. contruction to initialize book data
public book16(String code, String title, int year){
    this.code = code;
    this.title = title;
    this.year = year;
}

// 2. Method to display book information
    public void showBook() {
        System.out.printf("Book Code: %-5s | Title: %-15s | Year: %d\n", code, title, year);
    }
}
