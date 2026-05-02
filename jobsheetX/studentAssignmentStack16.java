package jobsheetX;
public class studentAssignmentStack16 {
    Student16[] stack;
    int top, size;

    studentAssignmentStack16(int size){
        this.size = size;
        top = -1;
        stack = new Student16[size];
    }

    boolean isFull(){
        if (top==size-1){
            return true;
        }else{
            return false;
        }
    }

    boolean isEmpty(){
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }

    void push(Student16 std){
        if(!isFull()){
            top++;
            stack[top] = std;
        }else{
            System.out.println("Stack is already full !!");
        }
    }

    Student16 pop(){
        if (!isEmpty()){
            Student16 std = stack[top];
            top--;
            return std;
        }else{
            System.out.println("There is no data in stack !!");
            return null;
        }
    }

    Student16 peek(){
        if(!isEmpty()){
            return stack[top];
        }else{
            System.out.println("There is no data is Stack !!");
            return null;
        }
    }
    
    void print(){
        for(int i=0; i<=top; i++){
            System.out.println(stack[i].name + "\t" + stack[i].nim + "\t" + stack[i].className);
        }
        System.out.println("");
    }

    public Student16 peekFirst() {
        if (!isEmpty()) {
            return stack[0]; // the first element pushed is always at index 0
        } else {
            System.out.println("Stack is empty!");
            return null;
        }
    }

    public int getCount(){
        return top + 1; //Since 'top' starts at -1, we add 1 to get the actual count
    }

    String convertToBinary(int grade){
        ConversionStack16 stack = new ConversionStack16();
        while (grade > 0) {
            int mod = grade % 2;
            stack.push(mod);
            grade = grade / 2;
        }
        String binary = "";
        while (!stack.isEmpty()) {
            binary += stack.pop();
        }
        return binary;
    }
}
