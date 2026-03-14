import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class interleaves {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        int size = q.size();
        int half = size/2;

        Queue<Integer> q2 = new ArrayBlockingQueue<>(half); // size of queue is 5
        for(int i=0; i<half; i++){
            int add = q.remove(); // removes the head of the queue i.e front 
            q2.add(add); // add the removed element at the end of queue no 2

        }

        while(!q2.isEmpty()){  // runs until q2 is not empty 
            int front = q2.remove(); // removes the front of the q2 and saves in the front variable
            q.add(front); // adds the same value into the main queue
            int rear = q.remove(); // removes the front of main queue 
            q.add(rear); // adds the removed front of main queue to itself again
        }
        System.out.println(q); // prints the requried output

    }
}
