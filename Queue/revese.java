import java.util.*;

public class revese {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q);

        while(!q.isEmpty()){
            int front = q.remove();
            // q.add(front);
            s.push(front);
        }

        while(!s.isEmpty()){
            int rear = s.pop();
            q.add(rear);
        }
        System.out.println(q);
    }
}
