public class detect {
    public class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    Node tail;

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

    public void removeCycle(){
        // base case 
        if(head == null || head.next == null){
            System.out.println("Cycle is Not present in Linked List");
            return;
        }

        // detect cycle in Linked Lists
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }

        // remove cycle

        slow = head;
        Node prev = null;

        while(slow != fast){
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null;
    }
    public static void main(String[] args) {
        
    }
}
