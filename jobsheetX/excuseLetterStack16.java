package jobsheetX;

public class excuseLetterStack16 {
    excuseLetter16[] stack;
    int size, top;

    public excuseLetterStack16(int size) {
        this.size = size;
        this.stack = new excuseLetter16[size];
        this.top = -1;
    }

    public void push(excuseLetter16 letter) {
        if (top < size - 1) {
            stack[++top] = letter;
        } else {
            System.out.println("Stack is full!");
        }
    }

    public excuseLetter16 pop() {
        if (top != -1) {
            return stack[top--];
        }
        return null;
    }

    public excuseLetter16 peek() {
        return (top != -1) ? stack[top] : null;
    }

    // Requirement: Search for Letter by student's name
    public void searchLetter(String studentName) {
        boolean found = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].name.equalsIgnoreCase(studentName)) {
                System.out.println("Letter found at position " + (top - i + 1) + " from top.");
                System.out.println("ID: " + stack[i].id + ", Type: " + stack[i].typeOfExcuse);
                found = true;
                break;
            }
        }
        if (!found) System.out.println("No letter found for " + studentName);
    }
}

