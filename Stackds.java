public class Stackds {
    private static Object[] stackarray;
    private static int size;
    private int top;
    public Stackds(int size) {
        this.size = size;
        this.top = -1;
        stackarray = new Object[size];
    }

    public void push(Object value) {
        if(top == size-1) {
            System.out.println("Stack is full");
        }
        top++;
        stackarray[top] = value;
        size++;
    } 

    public Object pop() {
        if(top == -1) {
            System.out.println("Stack is empty");
            return -1;
        }
        else {
            int oldtop = top;
            top--;
            stackarray[oldtop] = null;
            return stackarray[oldtop];
        }
    }

    public Object peek() {
        return stackarray[top];
    }

    public static void main(String[] args) {
        Stackds s = new Stackds(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.pop();
        //s.peek();
        for(int i=0;i<size;i++) {
            System.out.println(stackarray[i]);
        }
    }
}
