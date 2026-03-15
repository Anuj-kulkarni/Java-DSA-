import java.util.*;

public class stack {
    public static void main(String[] args) {
        Deque<Integer> s = new LinkedList<>();
        s.addLast(1);
        s.addLast(2);
        s.addLast(3);

        System.out.println(s);

        while(!s.isEmpty()){
            System.out.println(s.removeLast());
        }
        
    }
}
