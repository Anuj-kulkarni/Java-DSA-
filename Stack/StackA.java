// import java.util.LinkedList;

public class StackA {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class Stack{
        static Node Head = null;

        // isEmpty function
        public boolean isEmpty(){
            System.out.println("Stack Is Empty !!");
            return Head == null;
        }

        // push function using LL with 0(1) Time complexity
        public void push(int data){
            Node newnode = new Node(data);
            if(Head.next == null){
                Head = newnode;
                return;
            }
            newnode.next = Head;
            Head = newnode;
        }

        // pop function using LL with 0(1) time complexity
        public int pop(){
            if(Head.next == null){
                return -1;
            }
            int top = Head.data;
            Head = Head.next;
            return top;
        }

        // peek function using LL with 0(1) time complexity
        public int peek(){
            if(Head.next == null){
                return -1;
            }
            int top = Head.data;
            // Head = Head.next;
            return top;
        }
    }
    public static void main(String[] args) {
        Stack A = new Stack();
        // Stack<Integer> S = new Stack<>(); 
        // can use stack with above line of code
        A.isEmpty();
    }
}
