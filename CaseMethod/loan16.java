package CaseMethod;

public class loan16 {
    student16 std; // Object relationship
    book16 book;   // Object relationship
    int loanDuration;
    int loanLimit = 5; // Maximum loan limit is 5 days [cite: 404]
    int fine;
    int late;

    // Constructor
    public loan16(student16 std, book16 book, int loanDuration) {
        this.std = std;
        this.book = book;
        this.loanDuration = loanDuration;
        calculateFine(); // Automatically calculate the fine when a loan is recorded
    }

    // Method to calculate late days and total fine [cite: 400, 410]
    public void calculateFine() {
        if (loanDuration > loanLimit) {
            late = loanDuration - loanLimit;
            fine = late * 2000; // Rp 2,000 per day [cite: 405]
        } else {
            late = 0;
            fine = 0; // If not late, fine is 0 [cite: 406]
        }
    }

    // Method to display loan transaction details
    public void showLoan() {
        System.out.printf("Student: %-8s | Book: %-12s | Duration: %2d days | Late: %2d days | Fine: Rp %d\n", 
                           std.name, book.title, loanDuration, late, fine);
    }
}
