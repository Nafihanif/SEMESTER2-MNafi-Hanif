package jobsheetXII.experiment1;

public class SingleLinkedList16 {
    Node16 head;
    Node16 tail;

    boolean isEmpty(){
        return(head==null);
    }

    void print(){
        if(!isEmpty()){
            Node16 tmp = head;
            System.out.println("LinkedList Data:");
            while(tmp!=null){
                tmp.data.print();
                tmp = tmp.next;
            }
        }else{
            System.out.println("LinkedList is empty !!");
        }
    }

    void addFirst(Student16 std){
        Node16 newNode = new Node16(std, null);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    void addLast(Student16 std){
        Node16 newNode = new Node16(std,null);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    void insertAfter(Student16 std, String key) {
        Node16 newNode = new Node16(std, null);
        Node16 temp = head;
        do{
            if(temp.data.name.equalsIgnoreCase(key)){
                newNode.next = temp.next;
                temp.next = newNode;
                if(newNode.next == null){
                    tail = newNode;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index, Student16 std){
        if (index < 0 ){
            System.out.println("Wrong index !!");
        } else if (index == 0){
            addFirst(std);
        } else {
            Node16 temp = head;
            for(int i = 0; i < index - 1; i++){
                temp = temp.next;
            }
            temp.next = new Node16(std, temp.next);
            if(temp.next.next==null) {
                tail = temp.next;
            }
        }
    }

    
}
