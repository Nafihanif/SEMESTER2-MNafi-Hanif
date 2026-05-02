package jobsheetX;

public class ConversionStack16 {
    int[] binaryStack;
    int size;
    int top;

    public ConversionStack16() {
        this.size = 32; //asumsi 32 bit
        binaryStack = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size -1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is already fu;;-filled !!");
        } else {
          top++;
          binaryStack[top] = data;  
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stuck is still empty !!");
            return -1;
        } else {
            int data = binaryStack[top];
            top--;
            return data;
        }
    }
}
