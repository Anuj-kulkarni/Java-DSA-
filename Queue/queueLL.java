public class queueLL {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static class queue{
        static Node head = null;
        static Node tail = null;

        public void enqueue(int data){
            Node newnode = new Node(data);

            if(head == null){
                head = tail = newnode;
                return;
            }
            tail.next = newnode;
            tail = newnode;
        }

        public int dequeue(){
            if(head == null){
                System.out.println("Queue is empty");
                return -1;
            }

            if(head == tail){
                tail = head = null;
                return 0;
            }

            int front = head.data;
            head = head.next;
            return front;
        }

        public boolean isEmpty(){
            if(head == null){
                return true;
            }
            return false;
        }

        public void print(){
            Node temp = head;
            while(temp != null){
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        queue q = new queue();
        q.enqueue(0);
        q.enqueue(1);
        q.enqueue(2);

        q.print();
        System.out.println();
        q.dequeue();
        q.print();
    }
}
