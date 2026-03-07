public class print {
        public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head; 
    public Node tail; 

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void printLL(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public void add(int idx, int data){
        int i =0;
        if(idx == 0){
            addFirst(data);
            return ;
        }
        Node newnode = new Node(data);
        Node temp = head;
        while(i< idx-1){
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public void reverse(){
        Node prev = null; // You must initailze the variable's next to NULL
        Node next;
        Node curr = tail = head;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public void nthnode(int idx){
        int size = 0;
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
            size++;
        }

        if(idx == size){
            head = head.next;
            return;
        }
        int i =1;
        int ifindTo = size-idx;
        Node prev = head;
        while(i < ifindTo){
            prev = prev.next;
            i++;
        }

        if(prev.next != null){        
            prev.next = prev.next.next;
        }

        return;
    }

    public Node midnode(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next; // This node works slowly as only cover 1 node at one time
            fast = fast.next.next; // This Node works fast as cover 2 nodes at one time
        }

        return slow;  // Returns midnode of the Linked List
    }

    public boolean checkpal(){
        // base case 
        if(head == null || head.next == null){
            return true;
        }

        // Find the mid node of Linked list

        Node Midnode = midnode();
        // Make 2nd half reverse 

        Node next;
        Node prev = null;
        Node curr = Midnode;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;

        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public boolean cycle(){
        // base case 
        if(head == null || head.next == null){
            return false;
        }

        // Initialze the pointer slow and fast
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow.data == fast.data){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        print ll = new print();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addLast(3);
        ll.printLL();
        ll.add(2, 100);
        ll.printLL();
        ll.nthnode(1);
        ll.printLL();

        // System.out.println(ll.midnode());

        System.out.println(ll.checkpal());
    }
}
