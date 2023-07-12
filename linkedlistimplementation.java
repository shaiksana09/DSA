class Node {
    public Object item;
    public Node next; //pointing to the next node
}

public class linkedlistimplementation {
    private int size =0;
    private Node head;
    Node current;

    public linkedlistimplementation() {
        this.size = 0;
        this.head = null;
        this.current = null;
    }

    public void insertingnode(String i) {
        Node node = new Node();
        node.item = i;
        Node current = this.head;
        if(this.head == null) {
            this.head = node;
            this.head.next = null;
            System.out.println(this.head.toString());
        }
        else {
            while (current.next!=null) {
                current = current.next;
            }
            current.next = node;
            node.next = null;
            this.size += 1;
        }
    }

    public void addAtStarting(String i) {
        Node n = new Node();
        n.item =i;
        n.next = this.head;
        this.head = n;
    }

    public void addAtMiddle(String i, int pos) {
        Node n1 = new Node();
        Node current = this.head;
        if(this.head != null && pos <= this.size) {
            for(int j=0;j<pos;j++) {
                current = current.next;
            }
            n1.item = i;
            n1.next = current.next;
            current.next = n1;
        }
        else {
            System.out.println("Position is greater than size");
        }

    }
    public void deleteNode() {
        Node current=this.head;
        if(this.head==null){
            System.out.println("No nodes are present");
        }
        else{
            while(current.next != null){
                current=current.next;
                if(current.next.next==null){
                    current.next=null;
                }
            }
        }
    }

    public void deleteFirstNode() {

    }

    public void deleteLastNode() {

    }
    
    public void deleteAtMiddle(int pos) {

    }

    public void find(int value) {
        Node current = this.head;
        boolean flag = false;
        for(int i=0;i<size;i++) {
            if(current.item.equals(value)){
                System.out.println("Element is present at index" +i);
                flag = true;
                //break;
            }
            current = current.next;
        }
        if(!flag) {
            System.out.println("Element is not presented in the linked list");
        }
    }

    public void display() {
        Node current = this.head;
        for(int i=0;i<size;i++) {
            System.out.println(current.item);
            current = current.next;
        }
    }

    public void traverse() {
        if(this.head == null) {
            System.out.println("Linked list is empty");
        }
        else {
            Node current = this.head;
            System.out.println("The elements in the linked list are: ");
            for(int i=0;i<size;i++) {
                System.out.println(current.item+" ");
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        linkedlistimplementation list1 = new linkedlistimplementation();
        list1.insertingnode("sana");
        list1.insertingnode("vidya");
        list1.insertingnode("bella");
        list1.insertingnode("catheriene");
        list1.traverse();
        list1.addAtStarting("bhavya");
        list1.traverse();
        list1.addAtMiddle("ahna", 2);
        list1.traverse();
        list1.insertingnode("elsa");
        list1.traverse();
        list1.deleteFirstNode();
        list1.traverse();
        list1.deleteLastNode();
        list1.traverse();
        list1.deleteAtMiddle(2);
        list1.traverse();

    }
}